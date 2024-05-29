
Public Class Form1
    Private dl As New Week7DBDriver
    Dim newID As Integer
    Dim oldID As Integer
    Dim newFName As String
    Dim newLName As String
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        DataGridView1.SelectionMode = DataGridViewSelectionMode.FullRowSelect
        Dim dt As New DataTable
        dt = dl.getPeople()
        DataGridView1.DataSource = dt
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim dt As New DataTable
        oldID = newID
        Try
            Dim dr As DataGridViewRow = DataGridView1.SelectedRows(0)
            newID = dr.Cells("people_id").Value
            newFName = dr.Cells("firstname").Value.ToString
            newLName = dr.Cells("lastname").Value.ToString
            dl.updateRow(newID, oldID, newFName, newLName)
            dt = dl.getPeople
            DataGridView1.DataSource = dt
        Catch ex As Exception
            MessageBox.Show("ERROR: " & ex.Message)
        End Try
    End Sub

    Private Sub DataGridView1_SelectionChanged(sender As Object, e As EventArgs) Handles DataGridView1.SelectionChanged
        If DataGridView1.SelectedRows.Count < 0 Then
            Dim dr As DataGridViewRow = DataGridView1.SelectedRows(0)
            newID = dr.Cells("people_id").Value
            newFName = dr.Cells("firstname").Value.ToString
            newLName = dr.Cells("lastname").Value.ToString
        End If
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Dim dt As New DataTable
        Try
            Dim dr As DataGridViewRow = DataGridView1.Rows(DataGridView1.RowCount - 2)
            newID = dr.Cells("people_id").Value
            newFName = dr.Cells("firstname").Value.ToString
            newLName = dr.Cells("lastname").Value.ToString
            dl.AddCustomer(newID, newFName, newLName)
            dt = dl.getPeople
            DataGridView1.DataSource = dt
        Catch ex As Exception
            MessageBox.Show("ERROR: " & ex.Message)
        End Try
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        Dim dt As New DataTable
        Try
            Dim dr As DataGridViewRow = DataGridView1.SelectedRows(0)
            dl.deleteRow(dr)
            dt = dl.getPeople
            DataGridView1.DataSource = dt
        Catch ex As Exception
            MessageBox.Show("ERROR: " & ex.Message)
        End Try
    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        Application.Exit()
    End Sub
End Class
