'Joshua Stimpert
'Week 3 Lab
'16/09/17
Public Class Form1

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        If TextBox1.Text IsNot "" Then
            TreeView1.Nodes.Add(New TreeNode(TextBox1.Text))
            TextBox1.Text = ""
        End If
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        If TreeView1.SelectedNode IsNot Nothing Then
            TreeView1.SelectedNode.Nodes.Add(New TreeNode(TextBox2.Text))
            TextBox1.Text = ""
        End If
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        If TreeView1.GetNodeCount(False) > 0 Then
            TreeView1.SelectedNode.Remove()
        End If
    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        If TreeView1.SelectedNode IsNot Nothing Then
            ListBox1.Items.Add(TreeView1.SelectedNode.Text)
            For Each Node In TreeView1.SelectedNode.Nodes
                ListBox1.Items.Add(Node.Text)
            Next
            TreeView1.SelectedNode.Remove()
            TreeView1.SelectedNode = Nothing
        End If
    End Sub

    Private Sub Button5_Click(sender As Object, e As EventArgs) Handles Button5.Click
        If ListBox1.SelectedIndex <> -1 Then
            If TreeView1.SelectedNode IsNot Nothing Then
                For Each Item In ListBox1.SelectedItems
                    TreeView1.SelectedNode.Nodes.Add(New TreeNode(Item.ToString))
                    'I tried just about everything I can think of to get these items to delete once they have been moved, but nothing I do seems to work. 
                    'Any insight?
                    'ListBox1.Items.Remove(Item)
                Next
            Else
                For Each Item In ListBox1.SelectedItems
                    TreeView1.Nodes.Add(New TreeNode(Item.ToString))
                    'Same Problem here; When I move items with this command active I get a crash everytime but the error message isn't very insightful.
                    'ListBox1.Items.Remove(Item)
                Next
            End If
            'I've also tried replacing the listbox item removal code here and it crashed in the same way
            TreeView1.SelectedNode = Nothing
        End If
    End Sub

    Private Sub Button6_Click(sender As Object, e As EventArgs) Handles Button6.Click
        TreeView1.ExpandAll()
    End Sub

    Private Sub Button7_Click(sender As Object, e As EventArgs) Handles Button7.Click
        TreeView1.CollapseAll()
    End Sub

    Private Sub TrackBar1_ValueChanged(sender As Object, e As EventArgs) Handles TrackBar1.ValueChanged
        PictureBox1.Image = ImageList2.Images.Item(TrackBar1.Value)
    End Sub

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        PictureBox1.Image = ImageList2.Images.Item(TrackBar1.Value)
    End Sub
End Class
