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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form1))
        Dim TreeNode1 As System.Windows.Forms.TreeNode = New System.Windows.Forms.TreeNode("Chrysanthemum")
        Dim TreeNode2 As System.Windows.Forms.TreeNode = New System.Windows.Forms.TreeNode("Desert", 1, 1)
        Dim TreeNode3 As System.Windows.Forms.TreeNode = New System.Windows.Forms.TreeNode("Hydrangeas", 2, 2)
        Dim TreeNode4 As System.Windows.Forms.TreeNode = New System.Windows.Forms.TreeNode("Images", New System.Windows.Forms.TreeNode() {TreeNode1, TreeNode2, TreeNode3})
        Me.ImageList1 = New System.Windows.Forms.ImageList(Me.components)
        Me.TreeView1 = New System.Windows.Forms.TreeView()
        Me.ListBox1 = New System.Windows.Forms.ListBox()
        Me.Button1 = New System.Windows.Forms.Button()
        Me.Button2 = New System.Windows.Forms.Button()
        Me.Button3 = New System.Windows.Forms.Button()
        Me.TextBox1 = New System.Windows.Forms.TextBox()
        Me.TextBox2 = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Button4 = New System.Windows.Forms.Button()
        Me.Button5 = New System.Windows.Forms.Button()
        Me.Button6 = New System.Windows.Forms.Button()
        Me.Button7 = New System.Windows.Forms.Button()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.TrackBar1 = New System.Windows.Forms.TrackBar()
        Me.ImageList2 = New System.Windows.Forms.ImageList(Me.components)
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.TrackBar1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'ImageList1
        '
        Me.ImageList1.ImageStream = CType(resources.GetObject("ImageList1.ImageStream"), System.Windows.Forms.ImageListStreamer)
        Me.ImageList1.TransparentColor = System.Drawing.Color.Transparent
        Me.ImageList1.Images.SetKeyName(0, "Chrysanthemum.jpg")
        Me.ImageList1.Images.SetKeyName(1, "Desert.jpg")
        Me.ImageList1.Images.SetKeyName(2, "Hydrangeas.jpg")
        '
        'TreeView1
        '
        Me.TreeView1.ImageIndex = 0
        Me.TreeView1.ImageList = Me.ImageList1
        Me.TreeView1.Location = New System.Drawing.Point(12, 12)
        Me.TreeView1.Name = "TreeView1"
        TreeNode1.Name = "Node1"
        TreeNode1.Text = "Chrysanthemum"
        TreeNode2.ImageIndex = 1
        TreeNode2.Name = "Node2"
        TreeNode2.SelectedImageIndex = 1
        TreeNode2.Text = "Desert"
        TreeNode3.ImageIndex = 2
        TreeNode3.Name = "Node3"
        TreeNode3.SelectedImageIndex = 2
        TreeNode3.Text = "Hydrangeas"
        TreeNode4.Name = "Node0"
        TreeNode4.SelectedImageIndex = -2
        TreeNode4.Text = "Images"
        Me.TreeView1.Nodes.AddRange(New System.Windows.Forms.TreeNode() {TreeNode4})
        Me.TreeView1.SelectedImageIndex = 0
        Me.TreeView1.Size = New System.Drawing.Size(159, 250)
        Me.TreeView1.TabIndex = 0
        '
        'ListBox1
        '
        Me.ListBox1.AllowDrop = True
        Me.ListBox1.FormattingEnabled = True
        Me.ListBox1.Location = New System.Drawing.Point(344, 12)
        Me.ListBox1.Name = "ListBox1"
        Me.ListBox1.SelectionMode = System.Windows.Forms.SelectionMode.MultiSimple
        Me.ListBox1.Size = New System.Drawing.Size(145, 251)
        Me.ListBox1.TabIndex = 1
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(37, 268)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(100, 23)
        Me.Button1.TabIndex = 2
        Me.Button1.Text = "Add Node"
        Me.Button1.UseVisualStyleBackColor = True
        '
        'Button2
        '
        Me.Button2.Location = New System.Drawing.Point(37, 323)
        Me.Button2.Name = "Button2"
        Me.Button2.Size = New System.Drawing.Size(100, 23)
        Me.Button2.TabIndex = 2
        Me.Button2.Text = "Add Child"
        Me.Button2.UseVisualStyleBackColor = True
        '
        'Button3
        '
        Me.Button3.Location = New System.Drawing.Point(37, 378)
        Me.Button3.Name = "Button3"
        Me.Button3.Size = New System.Drawing.Size(100, 23)
        Me.Button3.TabIndex = 2
        Me.Button3.Text = "Remove Selected"
        Me.Button3.UseVisualStyleBackColor = True
        '
        'TextBox1
        '
        Me.TextBox1.Location = New System.Drawing.Point(37, 297)
        Me.TextBox1.Name = "TextBox1"
        Me.TextBox1.Size = New System.Drawing.Size(100, 20)
        Me.TextBox1.TabIndex = 3
        '
        'TextBox2
        '
        Me.TextBox2.Location = New System.Drawing.Point(37, 352)
        Me.TextBox2.Name = "TextBox2"
        Me.TextBox2.Size = New System.Drawing.Size(100, 20)
        Me.TextBox2.TabIndex = 4
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(143, 300)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(64, 13)
        Me.Label1.TabIndex = 5
        Me.Label1.Text = "Label Name"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(143, 355)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(64, 13)
        Me.Label2.TabIndex = 6
        Me.Label2.Text = "Label Name"
        '
        'Button4
        '
        Me.Button4.Location = New System.Drawing.Point(177, 74)
        Me.Button4.Name = "Button4"
        Me.Button4.Size = New System.Drawing.Size(161, 23)
        Me.Button4.TabIndex = 7
        Me.Button4.Text = "Move Selected to Listbox ->"
        Me.Button4.UseVisualStyleBackColor = True
        '
        'Button5
        '
        Me.Button5.Location = New System.Drawing.Point(177, 121)
        Me.Button5.Name = "Button5"
        Me.Button5.Size = New System.Drawing.Size(161, 23)
        Me.Button5.TabIndex = 7
        Me.Button5.Text = "<- Move Selected to TreeView"
        Me.Button5.UseVisualStyleBackColor = True
        '
        'Button6
        '
        Me.Button6.Location = New System.Drawing.Point(177, 185)
        Me.Button6.Name = "Button6"
        Me.Button6.Size = New System.Drawing.Size(75, 23)
        Me.Button6.TabIndex = 8
        Me.Button6.Text = "Expand"
        Me.Button6.UseVisualStyleBackColor = True
        '
        'Button7
        '
        Me.Button7.Location = New System.Drawing.Point(177, 214)
        Me.Button7.Name = "Button7"
        Me.Button7.Size = New System.Drawing.Size(75, 23)
        Me.Button7.TabIndex = 8
        Me.Button7.Text = "Collapse"
        Me.Button7.UseVisualStyleBackColor = True
        '
        'PictureBox1
        '
        Me.PictureBox1.Location = New System.Drawing.Point(238, 267)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(251, 134)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox1.TabIndex = 9
        Me.PictureBox1.TabStop = False
        '
        'TrackBar1
        '
        Me.TrackBar1.Location = New System.Drawing.Point(309, 407)
        Me.TrackBar1.Maximum = 2
        Me.TrackBar1.Name = "TrackBar1"
        Me.TrackBar1.Size = New System.Drawing.Size(104, 45)
        Me.TrackBar1.TabIndex = 10
        '
        'ImageList2
        '
        Me.ImageList2.ImageStream = CType(resources.GetObject("ImageList2.ImageStream"), System.Windows.Forms.ImageListStreamer)
        Me.ImageList2.TransparentColor = System.Drawing.Color.Transparent
        Me.ImageList2.Images.SetKeyName(0, "Chrysanthemum.jpg")
        Me.ImageList2.Images.SetKeyName(1, "Desert.jpg")
        Me.ImageList2.Images.SetKeyName(2, "Hydrangeas.jpg")
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(528, 481)
        Me.Controls.Add(Me.TrackBar1)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.Button7)
        Me.Controls.Add(Me.Button6)
        Me.Controls.Add(Me.Button5)
        Me.Controls.Add(Me.Button4)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.TextBox2)
        Me.Controls.Add(Me.TextBox1)
        Me.Controls.Add(Me.Button3)
        Me.Controls.Add(Me.Button2)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.ListBox1)
        Me.Controls.Add(Me.TreeView1)
        Me.Name = "Form1"
        Me.Text = "jStimpert - Week 3 Lab "
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.TrackBar1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents ImageList1 As System.Windows.Forms.ImageList
    Friend WithEvents TreeView1 As System.Windows.Forms.TreeView
    Friend WithEvents ListBox1 As System.Windows.Forms.ListBox
    Friend WithEvents Button1 As System.Windows.Forms.Button
    Friend WithEvents Button2 As System.Windows.Forms.Button
    Friend WithEvents Button3 As System.Windows.Forms.Button
    Friend WithEvents TextBox1 As System.Windows.Forms.TextBox
    Friend WithEvents TextBox2 As System.Windows.Forms.TextBox
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents Button4 As System.Windows.Forms.Button
    Friend WithEvents Button5 As System.Windows.Forms.Button
    Friend WithEvents Button6 As System.Windows.Forms.Button
    Friend WithEvents Button7 As System.Windows.Forms.Button
    Friend WithEvents PictureBox1 As System.Windows.Forms.PictureBox
    Friend WithEvents TrackBar1 As System.Windows.Forms.TrackBar
    Friend WithEvents ImageList2 As System.Windows.Forms.ImageList

End Class
