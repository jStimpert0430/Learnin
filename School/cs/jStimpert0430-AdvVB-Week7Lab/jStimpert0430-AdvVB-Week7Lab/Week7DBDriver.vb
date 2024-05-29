Imports System.Data
Imports System.Data.SqlClient

Public Class Week7DBDriver
    Private Function getConnectionString() As String
        Return My.Settings.peopleConnectionString
    End Function

    Public Function getPeople() As DataTable
        Dim sql As String
        Dim conn As SqlConnection
        Dim cmd As SqlCommand
        Dim da As SqlDataAdapter
        Dim dt As New DataTable()
        sql = "select people_id, firstname, lastname from labTable"
        conn = New SqlConnection(getConnectionString)
        conn.Open()
        cmd = New SqlCommand(sql, conn)
        da = New SqlDataAdapter(cmd)
        da.Fill(dt)
        conn.Close()
        Return dt
    End Function

    Public Sub AddCustomer(newID As Integer, newFname As String, newLName As String)
        Dim sql As String
        Dim conn As SqlConnection
        Dim cmd As SqlCommand
        sql = "insert into labTable(people_id, firstname, lastname) values(@id, @fname, @lname)"
        conn = New SqlConnection(getConnectionString())
        conn.Open()
        cmd = New SqlCommand(sql, conn)
        cmd.Parameters.AddWithValue("@id", newID)
        cmd.Parameters.AddWithValue("@fname", newFname)
        cmd.Parameters.AddWithValue("@lname", newLName)
        cmd.ExecuteNonQuery()
        conn.Close()

    End Sub

    Public Sub updateRow(updateID As Integer, oldID As Integer, updateFname As String, updateLname As String)
        Dim sql As String
        Dim conn As SqlConnection
        Dim cmd As SqlCommand
        sql = "update labTable set people_id=@id, firstname=@fname, lastname=@lname where people_id=@oldID"
        conn = New SqlConnection(getConnectionString())
        conn.Open()
        cmd = New SqlCommand(sql, conn)
        cmd.Parameters.AddWithValue("@id", updateID)
        cmd.Parameters.AddWithValue("@oldID", oldID)
        cmd.Parameters.AddWithValue("@fname", updateFname)
        cmd.Parameters.AddWithValue("@lname", updateLname)
        cmd.ExecuteNonQuery()
        conn.Close()
    End Sub


    Public Sub deleteRow(selectedRow As DataGridViewRow)
        Dim sql As String
        Dim conn As SqlConnection
        Dim cmd As SqlCommand
        sql = "delete from labTable where people_id=@id"
        conn = New SqlConnection(getConnectionString())
        conn.Open()
        cmd = New SqlCommand(sql, conn)
        cmd.Parameters.AddWithValue("@id", selectedRow.Cells("people_id").Value)
        cmd.ExecuteNonQuery()
        conn.Close()

    End Sub
End Class
