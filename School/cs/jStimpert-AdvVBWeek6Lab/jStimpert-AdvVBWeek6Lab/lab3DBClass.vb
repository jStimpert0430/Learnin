Imports System.Data
Imports System.Data.SqlClient
Imports System.Xml
Public Class lab3DBClass
    Private Function getConnectionString() As String
        Return My.Settings.NORTHWNDConnectionString
    End Function

    Public Function getEmployees() As DataTable
        Dim sql As String
        Dim conn As SqlConnection
        Dim cmd As SqlCommand
        Dim da As SqlDataAdapter
        Dim dt As New DataTable()
        sql = "select firstname, lastname, title, birthdate from employees"
        conn = New SqlConnection(getConnectionString)
        conn.Open()
        cmd = New SqlCommand(sql, conn)
        da = New SqlDataAdapter(cmd)
        da.Fill(dt)
        conn.Close()
        Return dt
    End Function

    Public Function getNumEmployees() As Integer
        Dim sql As String
        Dim conn As SqlConnection
        Dim cmd As SqlCommand
        sql = "select count(*) from employees"
        conn = New SqlConnection(getConnectionString)
        cmd = New SqlCommand()
        cmd.Connection = conn
        cmd.CommandType = CommandType.Text
        cmd.CommandText = sql
        Dim employeeCount As Integer
        conn.Open()
        employeeCount = CInt(cmd.ExecuteScalar())
        conn.Close()
        Return employeeCount
    End Function

    Public Function getXML() As String
        Dim conn As SqlConnection
        Dim cmd As SqlCommand
        Dim sql As String
        sql = "Select firstname, lastname from employees for XML Auto"
        conn = New SqlConnection(getConnectionString)
        cmd = New SqlCommand()
        cmd.Connection = conn
        cmd.CommandType = CommandType.Text
        cmd.CommandText = sql
        conn.Open()
        Dim reader As XmlReader = cmd.ExecuteXmlReader()
        Dim myXML As String = ""
        reader.Read()
        Do While reader.ReadState <> Xml.ReadState.EndOfFile
            myXML += reader.ReadOuterXml().ToString() & vbCrLf
        Loop
        reader.Close()
        conn.Close()
        Return myXML
    End Function
End Class
