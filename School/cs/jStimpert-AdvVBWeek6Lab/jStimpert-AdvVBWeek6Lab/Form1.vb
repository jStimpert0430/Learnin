Public Class Form1
    Private dl As New lab3DBClass
    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        TextBox1.Text = dl.getXML
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim dt As New DataTable
        dt = dl.getEmployees()
        DataGridView1.DataSource = dt
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Label3.Text = "Employee Count: " + dl.getNumEmployees.ToString
    End Sub
End Class
