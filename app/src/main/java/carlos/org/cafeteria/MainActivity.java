package carlos.org.cafeteria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtPedir=null;
    private Button btnPedido=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtPedir =(EditText)findViewById(R.id.txtPedir);
        btnPedido=(Button)findViewById(R.id.btnPedido);
        btnPedido.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                Intent intent=new Intent(MainActivity.this,Factura.class);
                intent.putExtra("pedido",txtPedir.getText().toString());
                startActivity(intent);

            }

        });

    }
}
