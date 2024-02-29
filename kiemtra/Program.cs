using System;
using System.Windows.Forms;

namespace XetTuyenApp
{
    public partial class MainForm : Form
    {
        private TextBox textBoxDiemMon1;
        private TextBox textBoxDiemMon2;
        private TextBox textBoxDiemMon3;
        private CheckBox checkBoxUuTien;
        private Button buttonXetTuyen;
        private Button buttonNhapTiep;
        private Button buttonThoat;
        private Label labelKetQua;

        public MainForm()
        {
            InitializeComponent();
        }

        private void InitializeComponent()
        {
            //* họ tên , địa chỉ , ngành xet tuyển 

            // Tạo các control và đặt vị trí, kích thước, v.v.
            textBoxDiemMon1 = new TextBox();
            textBoxDiemMon2 = new TextBox();
            textBoxDiemMon3 = new TextBox();
            checkBoxUuTien = new CheckBox();
            buttonXetTuyen = new Button();
            buttonNhapTiep = new Button();
            buttonThoat = new Button();
            labelKetQua = new Label();
            Label labelDiemMon1 = new Label();
            Label labelDiemMon2 = new Label();
            Label labelDiemMon3 = new Label();

            labelDiemMon1.Text = "Điểm môn 1";
            labelDiemMon1.Location = new Point(50, 50);
            labelDiemMon1.Size = new Size(100, 20);
            this.Controls.Add(labelDiemMon1);

            // TextBox Điểm Môn Một
            textBoxDiemMon1.Location = new Point(160, 50);
            textBoxDiemMon1.Size = new Size(100, 20);
            this.Controls.Add(textBoxDiemMon1);

            // Label "Điểm môn hai"
            labelDiemMon2.Text = "Điểm môn 2";
            labelDiemMon2.Location = new Point(50, 80);
            labelDiemMon2.Size = new Size(100, 20);
            this.Controls.Add(labelDiemMon2);

            // TextBox Điểm Môn Hai
            textBoxDiemMon2.Location = new Point(160, 80);
            textBoxDiemMon2.Size = new Size(100, 20);
            this.Controls.Add(textBoxDiemMon2);

            // Label "Điểm môn ba"
            labelDiemMon3.Text = "Điểm môn 3";
            labelDiemMon3.Location = new Point(50, 110);
            labelDiemMon3.Size = new Size(100, 20);
            this.Controls.Add(labelDiemMon3);

            // TextBox Điểm Môn Ba
            textBoxDiemMon3.Location = new Point(160, 110);
            textBoxDiemMon3.Size = new Size(100, 20);
            this.Controls.Add(textBoxDiemMon3);

            checkBoxUuTien.Location = new Point(50, 140);
            checkBoxUuTien.Size = new Size(150, 20);
            checkBoxUuTien.Text = "Ưu tiên";
            this.Controls.Add(checkBoxUuTien);

            buttonXetTuyen.Location = new Point(50, 170);
            buttonXetTuyen.Size = new Size(100, 30);
            buttonXetTuyen.Text = "Xét Tuyển";
            this.Controls.Add(buttonXetTuyen);

            buttonNhapTiep.Location = new Point(160, 170);
            buttonNhapTiep.Size = new Size(100, 30);
            buttonNhapTiep.Text = "Nhập Tiếp";
            this.Controls.Add(buttonNhapTiep);

            buttonThoat.Location = new Point(270, 170);
            buttonThoat.Size = new Size(100, 30);
            buttonThoat.Text = "Thoát";
            this.Controls.Add(buttonThoat);

            labelKetQua.Location = new Point(50, 220);
            labelKetQua.Size = new Size(300, 20);
            labelKetQua.Text = "Kết Quả Xét Tuyển";
            this.Controls.Add(labelKetQua);

            // Cấu hình các control và thêm vào form
            // ...
            Label labelHoTen = new Label();
            labelHoTen.Text = "Họ tên";
            labelHoTen.Location = new Point(350, 20);
            labelHoTen.Size = new Size(100, 20);
            this.Controls.Add(labelHoTen);

            // TextBox Họ Tên
            TextBox textBoxHoTen = new TextBox();
            textBoxHoTen.Location = new Point(460, 20);
            textBoxHoTen.Size = new Size(200, 20);
            this.Controls.Add(textBoxHoTen);

            // Label "Địa chỉ"
            Label labelDiaChi = new Label();
            labelDiaChi.Text = "Địa chỉ";
            labelDiaChi.Location = new Point(350, 50); // Điều chỉnh giá trị X
            labelDiaChi.Size = new Size(100, 20);
            this.Controls.Add(labelDiaChi);

            // TextBox Địa Chỉ
            TextBox textBoxDiaChi = new TextBox();
            textBoxDiaChi.Location = new Point(460, 50);
            textBoxDiaChi.Size = new Size(200, 20);
            this.Controls.Add(textBoxDiaChi);

            // Label "Ngành dự tuyển"
            Label labelNganhDuTuyen = new Label();
            labelNganhDuTuyen.Text = "Ngành dự tuyển";
            labelNganhDuTuyen.Location = new Point(350, 80);
            labelNganhDuTuyen.Size = new Size(100, 20);
            this.Controls.Add(labelNganhDuTuyen);

            // TextBox Ngành Dự Tuyển
            TextBox textBoxNganhDuTuyen = new TextBox();
            textBoxNganhDuTuyen.Location = new Point(460, 80);
            textBoxNganhDuTuyen.Size = new Size(200, 20);
            this.Controls.Add(textBoxNganhDuTuyen);


            // Sự kiện click cho nút "Xét Tuyển"
            buttonXetTuyen.Click += ButtonXetTuyen_Click;

            // Sự kiện click cho nút "Nhập Tiếp"
            buttonNhapTiep.Click += ButtonNhapTiep_Click;

            // Sự kiện click cho nút "Thoát"
            buttonThoat.Click += ButtonThoat_Click;
        }

        private void ButtonXetTuyen_Click(object sender, EventArgs e)
        {
           
            double diemMon1 = Convert.ToDouble(textBoxDiemMon1.Text);
            double diemMon2 = Convert.ToDouble(textBoxDiemMon2.Text);
            double diemMon3 = Convert.ToDouble(textBoxDiemMon3.Text);

            double diemUuTien = checkBoxUuTien.Checked ? 2 : 0;

            double tongDiem = diemMon1 + diemMon2 + diemMon3 + diemUuTien;

            if (tongDiem >= 15)
                labelKetQua.Text = "Trúng tuyển";
            else
                labelKetQua.Text = "Không trúng tuyển";
        }

        private void ButtonNhapTiep_Click(object sender, EventArgs e)
        {
            // Xóa toàn bộ thông tin từ TextBox và Label
            textBoxDiemMon1.Text = "";
            textBoxDiemMon2.Text = "";
            textBoxDiemMon3.Text = "";
           
            checkBoxUuTien.Checked = false;
            labelKetQua.Text = "";
        }

        private void ButtonThoat_Click(object sender, EventArgs e)
        {
            // Hộp thoại xác nhận thoát
            DialogResult result = MessageBox.Show("Bạn có muốn thoát không?", "Xác nhận", MessageBoxButtons.OKCancel);
            if (result == DialogResult.OK)
            {
                // Thoát chương trình
                Application.Exit();
            }
        }

        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new MainForm());
        }
    }
}
