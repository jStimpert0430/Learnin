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
        Me.DataGridView1 = New System.Windows.Forms.DataGridView()
        Me.Button1 = New System.Windows.Forms.Button()
        Me.Button2 = New System.Windows.Forms.Button()
        Me.Button3 = New System.Windows.Forms.Button()
        Me.Button4 = New System.Windows.Forms.Button()
        Me.PeopleDataSet = New jStimpert0430_AdvVB_Week7Lab.peopleDataSet()
        Me.PeopleDataSetBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        CType(Me.DataGridView1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PeopleDataSet, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PeopleDataSetBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'DataGridView1
        '
        Me.DataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.DataGridView1.Location = New System.Drawing.Point(12, 12)
        Me.DataGridView1.MultiSelect = False
        Me.DataGridView1.Name = "DataGridView1"
        Me.DataGridView1.Size = New System.Drawing.Size(381, 206)
        Me.DataGridView1.TabIndex = 0
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(12, 224)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(132, 23)
        Me.Button1.TabIndex = 1
        Me.Button1.Text = "Update Selected Row"
        Me.Button1.UseVisualStyleBackColor = True
        '
        'Button2
        '
        Me.Button2.Location = New System.Drawing.Point(12, 253)
        Me.Button2.Name = "Button2"
        Me.Button2.Size = New System.Drawing.Size(132, 23)
        Me.Button2.TabIndex = 2
        Me.Button2.Text = "Add Last Row"
        Me.Button2.UseVisualStyleBackColor = True
        '
        'Button3
        '
        Me.Button3.Location = New System.Drawing.Point(12, 281)
        Me.Button3.Name = "Button3"
        Me.Button3.Size = New System.Drawing.Size(132, 23)
        Me.Button3.TabIndex = 3
        Me.Button3.Text = "Delete Selected Row"
        Me.Button3.UseVisualStyleBackColor = True
        '
        'Button4
        '
        Me.Button4.Location = New System.Drawing.Point(263, 224)
        Me.Button4.Name = "Button4"
        Me.Button4.Size = New System.Drawing.Size(130, 80)
        Me.Button4.TabIndex = 4
        Me.Button4.Text = "Exit"
        Me.Button4.UseVisualStyleBackColor = True
        '
        'PeopleDataSet
        '
        Me.PeopleDataSet.DataSetName = "peopleDataSet"
        Me.PeopleDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'PeopleDataSetBindingSource
        '
        Me.PeopleDataSetBindingSource.DataSource = Me.PeopleDataSet
        Me.PeopleDataSetBindingSource.Position = 0
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(405, 316)
        Me.Controls.Add(Me.Button4)
        Me.Controls.Add(Me.Button3)
        Me.Controls.Add(Me.Button2)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.DataGridView1)
        Me.Name = "Form1"
        Me.Text = "jStimpert0430-Week7Lab"
        CType(Me.DataGridView1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PeopleDataSet, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PeopleDataSetBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents DataGridView1 As System.Windows.Forms.DataGridView
    Friend WithEvents Button1 As System.Windows.Forms.Button
    Friend WithEvents Button2 As System.Windows.Forms.Button
    Friend WithEvents Button3 As System.Windows.Forms.Button
    Friend WithEvents Button4 As System.Windows.Forms.Button
    Friend WithEvents PeopleDataSetBindingSource As System.Windows.Forms.BindingSource
    Friend WithEvents PeopleDataSet As jStimpert0430_AdvVB_Week7Lab.peopleDataSet

End Class
