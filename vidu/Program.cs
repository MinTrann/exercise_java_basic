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
            // Tạo các control và đặt vị trí, kích thước, v.v.
            textBoxDiemMon1 = new TextBox();
            textBoxDiemMon2 = new TextBox();
            textBoxDiemMon3 = new TextBox();
            checkBoxUuTien = new CheckBox();
            buttonXetTuyen = new Button();
            buttonNhapTiep = new Button();
            buttonThoat = new Button();
            labelKetQua = new Label();

            // Cấu hình các control và thêm vào form
            // ...

            // Đặt vị trí, kích thước, v.v. cho các control
            // ...

            // Sự kiện click cho nút "Xét Tuyển"
            buttonXetTuyen.Click += ButtonXetTuyen_Click;

            // Sự kiện click cho nút "Nhập Tiếp"
            buttonNhapTiep.Click += ButtonNhapTiep_Click;

            // Sự kiện click cho nút "Thoát"
            buttonThoat.Click += ButtonThoat_Click;
        }

        private void ButtonXetTuyen_Click(object sender, EventArgs e)
        {
            // Xử lý logic xét tuyển ở đây
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
