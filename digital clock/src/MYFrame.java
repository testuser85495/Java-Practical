import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MYFrame extends JFrame {
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;

    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;

    JLabel dateLabel;


    String time;
    String day;
    String date;

    MYFrame()
    {
        //frame overview how frame see
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock");
        this.getContentPane().setBackground(Color.blue);
        this.setLayout(new FlowLayout());
        this.setSize(400,250);

        //format for how to display day,time,date
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        //  Time Color and font
//        JLabel label = new JLabel("TIME");
//        Container contentPane = this.getContentPane();
//        contentPane.add(label);
        timeLabel = new JLabel("TIME");
        timeLabel.setFont(new Font("verdana",Font.BOLD,50));
//        timeLabel.setName("hello");
        timeLabel.setForeground(Color.green);
//        timeLabel.setOpaque(true);

        //Day Color and font
        dayLabel = new JLabel("DAY");
        dayLabel.setFont(new Font("verdana",Font.BOLD,50));
        dayLabel.setForeground(Color.green);

        //Date Color and font
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("verdana",Font.BOLD,50));
        dateLabel.setForeground(Color.green);

        //Display
        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        //method call
        setTime();
    }

    //method create
    public void setTime()
    {
        while(true)
        {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
