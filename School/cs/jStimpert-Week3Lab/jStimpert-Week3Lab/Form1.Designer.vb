<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.components = New System.ComponentModel.Container()
        Dim TreeNode1 As System.Windows.Forms.TreeNode = New System.Windows.Forms.TreeNode("Desert")
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form1))
        Me.TreeView1 = New System.Windows.Forms.TreeView()
        Me.ListBox1 = New System.Windows.Forms.ListBox()
        Me.ImageList1 = New System.Windows.Forms.ImageList(Me.components)
        Me.TrackBar1 = New System.Windows.Forms.TrackBar()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        CType(Me.TrackBar1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'TreeView1
        '
        Me.TreeView1.ImageIndex = 0
        Me.TreeView1.ImageList = Me.ImageList1
        Me.TreeView1.Location = New System.Drawing.Point(12, 22)
        Me.TreeView1.Name = "TreeView1"
        TreeNode1.Name = "Desert"
        TreeNode1.Text = "Desert"
        Me.TreeView1.Nodes.AddRange(New System.Windows.Forms.TreeNode() {TreeNode1})
        Me.TreeView1.SelectedImageIndex = 0
        Me.TreeView1.Size = New System.Drawing.Size(204, 362)
        Me.TreeView1.TabIndex = 0
        '
        'ListBox1
        '
        Me.ListBox1.FormattingEnabled = True
        Me.ListBox1.Location = New System.Drawing.Point(245, 22)
        Me.ListBox1.Name = "ListBox1"
        Me.ListBox1.Size = New System.Drawing.Size(331, 69)
        Me.ListBox1.TabIndex = 1
        '
        'ImageList1
        '
        Me.ImageList1.ImageStream = CType(resources.GetObject("ImageList1.ImageStream"), System.Windows.Forms.ImageListStreamer)
        Me.ImageList1.TransparentColor = System.Drawing.Color.Transparent
        Me.ImageList1.Images.SetKeyName(0, "Desert.jpg")
        Me.ImageList1.Images.SetKeyName(1, "Chrysanthemum.jpg")
        Me.ImageList1.Images.SetKeyName(2, "Hydrangeas.jpg")
        Me.ImageList1.Images.SetKeyName(3, "Jellyfish.jpg")
        '
        'TrackBar1
        '
        Me.TrackBar1.Location = New System.Drawing.Point(370, 370)
        Me.TrackBar1.Name = "TrackBar1"
        Me.TrackBar1.Size = New System.Drawing.Size(104, 45)
        Me.TrackBar1.TabIndex = 2
        '
        'PictureBox1
        '
        Me.PictureBox1.Location = New System.Drawing.Point(245, 111)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(331, 253)
        Me.PictureBox1.TabIndex = 3
        Me.PictureBox1.TabStop = False
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(598, 464)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.TrackBar1)
        Me.Controls.Add(Me.ListBox1)
        Me.Controls.Add(Me.TreeView1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        CType(Me.TrackBar1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents TreeView1 As System.Windows.Forms.TreeView
    Friend WithEvents ListBox1 As System.Windows.Forms.ListBox
    Friend WithEvents ImageList1 As System.Windows.Forms.ImageList
    Friend WithEvents TrackBar1 As System.Windows.Forms.TrackBar
    Friend WithEvents PictureBox1 As System.Windows.Forms.PictureBox

End Class
