package uneti.edu.vn.unetituyensinhapp;

import android.icu.text.UnicodeSetSpanner;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.UnsupportedEncodingException;

public class TestHTMLActivity extends AppCompatActivity {
    private ImageView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_html);
        String html = "<p style=\"margin: 0in 0in 5.65pt; text-indent: 28.35pt; text-align: justify;\"><span style=\"font-family: tahoma, arial, helvetica, sans-serif; font-size: 12pt; text-align: justify; text-indent: 28.35pt;\">Thực hiện theo Quyết định số 183/QĐ - ĐHKTKTCN; chiều 23/05/2017, tại ph&ograve;ng 405 khu nh&agrave; 9 tầng - 456 Minh Khai H&agrave; Nội, khoa C&ocirc;ng nghệ th&ocirc;ng tin đ&atilde; tổ chức th&agrave;nh c&ocirc;ng hội nghị nghiệm thu c&aacute;c đề t&agrave;i nghi&ecirc;n cứu khoa học cấp cơ sở năm học 2016-2017.</span></p>\n" +
                "<p style=\"margin: 0in 0in 5.65pt; text-indent: 28.35pt; text-align: justify;\"><span style=\"font-size: 12pt; font-family: tahoma, arial, helvetica, sans-serif;\">Năm 2016-2017, khoa C&ocirc;ng nghệ th&ocirc;ng tin c&oacute; 4 đề t&agrave;i nghi&ecirc;n cứu khoa học cấp cơ sở được duyệt để đưa v&agrave;o bảo vệ. Hội nghị đ&atilde; được tiến h&agrave;nh nghi&ecirc;m t&uacute;c theo đ&uacute;ng qui định của nh&agrave; trường về tr&igrave;nh tự đ&aacute;nh gi&aacute; một đề t&agrave;i nghi&ecirc;n cứu khoa học. C&aacute;c &yacute; kiến đ&oacute;ng g&oacute;p của th&agrave;nh vi&ecirc;n Hội đồng v&agrave; c&aacute;c đại biểu tham dự đều tập trung v&agrave;o khai th&aacute;c t&iacute;nh mới, t&iacute;nh khoa học v&agrave; t&iacute;nh khả thi của mỗi đề t&agrave;i. </span></p>\n" +
                "<p style=\"margin: 0in 0in 5.65pt; text-indent: 28.35pt; text-align: justify;\"><span style=\"font-size: 12pt; font-family: tahoma, arial, helvetica, sans-serif;\">C&aacute;c đề t&agrave;i khoa học cấp cơ sở năm 2016-2017 của khoa C&ocirc;ng nghệ th&ocirc;ng tin đều c&oacute; thể ứng dụng trong thực tiễn hoặc c&oacute; thể sử dụng để n&acirc;ng cao chất lượng giảng dạy. Như đề t&agrave;i \"<strong>X&acirc;y dựng độ đo đ&aacute;nh gi&aacute; chất lượng c&aacute;c phương ph&aacute;p x&aacute;c định tập thuộc t&iacute;nh tối ưu trong hệ quyết định\"</strong> của Tiến sĩ Ph&ugrave;ng Thị Thu Hiền c&oacute; thể triển khai cho nhiều đề t&agrave;i nghi&ecirc;n cứu khoa học, đồ &aacute;n tốt nghiệp của sinh vi&ecirc;n. Đề t&agrave;i:<strong>&ldquo;Nghi&ecirc;n cứu m&ocirc; h&igrave;nh quản l&yacute; t&iacute;nh di động của phương tiện trong mạng VANET&rdquo;</strong>của Thạc sỹ Nguyễn Ho&agrave;ng Chiến đ&atilde; đưa ra một số m&ocirc; h&igrave;nh giao th&ocirc;ng đ&ocirc; thị; dựa v&agrave;o c&aacute;c nguy&ecirc;n l&yacute; v&agrave; đặc điểm của hệ thống để đề xuất c&aacute;ch quản l&yacute; t&iacute;nh di động của phương tiện trong mạng VANET. Hướng ph&aacute;t triển của đề t&agrave;i c&oacute; thể được ứng dụng trong điều h&agrave;nh v&agrave; ph&acirc;n phối hệ thống giao th&ocirc;ng hiệu quả. Đề t&agrave;i<strong>: &ldquo;Hệ thống thu thập v&agrave; tr&iacute;ch r&uacute;t th&ocirc;ng tin từ dữ liệu web theo chủ đề&rdquo;</strong> &ndash; của Thạc sỹ Mai Mạnh Trừng v&agrave; đề t&agrave;i: <strong>&ldquo;Nghi&ecirc;n cứu luật kết hợp hỗ trợ dự đo&aacute;n kết quả học tập của sinh vi&ecirc;n</strong>&rdquo; của thạc sỹ Đỗ Tuấn Hạnh nghi&ecirc;n cứu về lĩnh vực xử l&yacute; ng&ocirc;n ngữ tự nhi&ecirc;n, khai ph&aacute; dữ liệu (data mining), khai ph&aacute; web (web mining) với nhiều t&iacute;nh s&aacute;ng tạo rất th&iacute;ch hợp với xu hướng nghi&ecirc;n cứu v&agrave; sự ph&aacute;t triển c&ocirc;ng nghệ hiện nay.</span></p>\n" +
                "<p style=\"margin: 0in 0in 5.65pt; text-align: justify;\"><span style=\"font-size: 12pt; font-family: tahoma, arial, helvetica, sans-serif;\">&nbsp; &nbsp; &nbsp; Cả 4 đề t&agrave;i đ&atilde; bảo vệ th&agrave;nh c&ocirc;ng v&agrave; nhận được sự đ&aacute;nh gi&aacute; cao của c&aacute;c hội đồng nghiệm thu trước sự quan t&acirc;m theo d&otilde;i của nhiều c&aacute;n bộ, giảng vi&ecirc;n v&agrave; sinh vi&ecirc;n trong nh&agrave; trường.</span></p>\n" +
                "<p style=\"margin: 0in 0in 5.65pt; text-align: justify; text-indent: 28.35pt;\"><strong><span style=\"font-size: 12pt; font-family: tahoma, arial, helvetica, sans-serif;\">Một số h&igrave;nh ảnh trong hội nghị nghiệm thu đề t&agrave;i.</span></strong></p>\n" +
                "<p style=\"margin: 0in 0in 5.65pt; text-indent: 28.35pt;\"><strong><span style=\"font-size: 12pt; font-family: tahoma, arial, helvetica, sans-serif;\"><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"images/Dulieuanh/cohienbaocao2_2017_1.gif\" alt=\"cohienbaocao2 2017 1\" width=\"525\" height=\"393\" /></span></strong></p>\n" +
                "<p style=\"margin: 0in 0in 5.65pt; text-indent: 28.35pt; text-align: center;\">&nbsp;<span style=\"font-size: 12pt; font-family: tahoma, arial, helvetica, sans-serif;\"><em><span style=\"line-height: 150%;\">TS. Ph&ugrave;ng Thị Thu Hiền b&aacute;o c&aacute;o đề t&agrave;i \"</span></em><strong><span style=\"line-height: 150%;\"> X&acirc;y dựng độ đo đ&aacute;nh gi&aacute; chất lượng c&aacute;c phương ph&aacute;p x&aacute;c định tập thuộc t&iacute;nh tối ưu trong hệ quyết định\"</span></strong></span></p>\n" +
                "<p style=\"margin: 0in 0in 5.65pt; text-indent: 28.35pt; text-align: center;\"><span style=\"font-size: 12pt; font-family: tahoma, arial, helvetica, sans-serif;\"><strong><span style=\"line-height: 150%;\"><img src=\"images/Dulieuanh/thaychienbaocao_dtcso2017_4.gif\" alt=\"thaychienbaocao dtcso2017 4\" width=\"506\" height=\"285\" /></span></strong></span></p>\n" +
                "<p style=\"margin: 0in 0in 5.65pt; text-indent: 28.35pt; text-align: center;\"><em style=\"font-family: tahoma, arial, helvetica, sans-serif; font-size: 12pt;\">ThS Nguyễn Ho&agrave;ng Chiến b&aacute;o c&aacute;o đề t&agrave;i&nbsp;\"</em><strong style=\"font-family: tahoma, arial, helvetica, sans-serif; font-size: 12pt;\">Nghi&ecirc;n cứu m&ocirc; h&igrave;nh quản l&yacute; t&iacute;nh di động của phương tiện trong mạng VANET\"</strong></p>\n" +
                "<p style=\"margin: 0in 0in 5.65pt; text-align: center;\" align=\"center\"><span style=\"font-size: 12pt; font-family: tahoma, arial, helvetica, sans-serif;\"><strong><img src=\"images/Dulieuanh/thayhanhbaocaodetai2017_3.gif\" alt=\"thayhanhbaocaodetai2017 3\" width=\"514\" height=\"385\" /></strong></span></p>\n" +
                "<p style=\"margin: 0in 0in 5.65pt; text-align: center;\" align=\"center\"><em style=\"font-family: tahoma, arial, helvetica, sans-serif; font-size: 12pt;\">ThS. Đỗ Tuấn Hạnh b&aacute;o c&aacute;o đề t&agrave;i \"</em><strong style=\"font-family: tahoma, arial, helvetica, sans-serif; font-size: 12pt;\"> Nghi&ecirc;n cứu luật kết hợp hỗ trợ dự đo&aacute;n kết quả học tập của&nbsp;</strong><span style=\"font-size: 12pt; font-family: tahoma, arial, helvetica, sans-serif;\"><strong>sinh vi&ecirc;n\"</strong><em>&nbsp;</em></span></p>\n" +
                "<p style=\"margin: 0in 0in 5.65pt; text-align: center;\" align=\"center\"><span style=\"font-size: 12pt; font-family: tahoma, arial, helvetica, sans-serif;\"><em><img src=\"images/Dulieuanh/thaytrungbaocao2017_2.gif\" alt=\"thaytrungbaocao2017 2\" width=\"515\" height=\"386\" /></em></span></p>\n" +
                "<p style=\"margin: 0in 0in 5.65pt; text-align: center;\" align=\"center\"><span style=\"font-size: 12pt; font-family: tahoma, arial, helvetica, sans-serif;\"><em style=\"font-family: tahoma, arial, helvetica, sans-serif; font-size: 12pt;\">Hội đồng trao đổi c&aacute;c vấn đề mới của đề t&agrave;i \"</em><strong style=\"font-family: tahoma, arial, helvetica, sans-serif; font-size: 12pt;\"> Hệ thống thu thập v&agrave; tr&iacute;ch r&uacute;t th&ocirc;ng tin từ dữ liệu web theo chủ đề\"-</strong><em style=\"font-family: tahoma, arial, helvetica, sans-serif; font-size: 12pt;\">CNĐT:</em><em style=\"font-family: tahoma, arial, helvetica, sans-serif; font-size: 12pt;\">ThS. Mai Mạnh Trừng</em></span></p>";
        LinearLayout ll = (LinearLayout) findViewById(R.id.linear_layout_html);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        Document document = Jsoup.parse(html);
        textView = (ImageView) findViewById(R.id.text_html);
        TextView tv = (TextView) findViewById(R.id.tv_ed);
        String src = null;
        String text = null;
        String align = null;
        Elements p = document.select("p");
        for (Element element : p) {
            if (element.select(":has(img)").isEmpty()) {
                text = element.toString();
                if (element.select("p[style*=text-align: center]").isEmpty()) {
                    CardViewCustom card = new CardViewCustom(this);
                    TextView t = (TextView) card.findViewById(R.id.text_v);
                    t.setText(Html.fromHtml(text));
                    ll.addView(card, lp);
                } else {

                    TextView k = new TextView(this);
                    k.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                    k.setTextColor(getResources().getColor(R.color.colorPrimary));
                    k.setText(Html.fromHtml(text));
                    ll.addView(k, lp);
                }


            } else {
                Element image = element.select("img").first();
                src = image.attr("src");
                String u = "http://khoacntt.uneti.edu.vn/" + src;
                ImageView im = new ImageView(this);
                try {
                    Picasso.with(getApplicationContext()).load(u).placeholder(R.drawable.back_ground).error(R.drawable.back_ground).into(im);
                } catch (Exception ex) {
                    im.setImageResource(R.drawable.cheese_1);
                }
                ll.addView(im, lp);
            }
        }

    }
}
