Public Class Form1
    Private dl As labDBClass1
    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        TextBox1.Text = dl.getXML()
    End Sub
End Class
