package fcmexample.dowellcomputer.test_03;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import Fragment.FragmentHome;
import Fragment.FragmentNotice;
import Fragment.FragmentQuestion;

public class MainActivity extends AppCompatActivity {

    //fragment
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private FragmentHome fragmentHome = new FragmentHome();
    private FragmentNotice fragmentNotice = new FragmentNotice();
    private FragmentQuestion fragmentQuestion = new FragmentQuestion();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.Fram_Menu_Layout,fragmentHome).commitAllowingStateLoss();

        BottomNavigationView bottomNavigationView = findViewById(R.id.Bottom_Navigation_View);
        bottomNavigationView.setOnNavigationItemSelectedListener(new ItemSelectedListener());

    }

    class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch (menuItem.getItemId()) {
                case R.id.mainItem:
                    transaction.replace(R.id.Fram_Menu_Layout, fragmentHome).commitAllowingStateLoss();

                    break;
                case R.id.noticeItem:
                    transaction.replace(R.id.Fram_Menu_Layout, fragmentNotice).commitAllowingStateLoss();
                    break;
                case R.id.questionItem:
                    transaction.replace(R.id.Fram_Menu_Layout, fragmentQuestion).commitAllowingStateLoss();
                    break;
            }
            return true;
        }


    }}
