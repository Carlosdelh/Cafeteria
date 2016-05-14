package carlos.org.cafeteria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Factura extends AppCompatActivity {

    private TextView txtPedidonull;
    private TextView txtTotal=null;
    private Button btnRegresar= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);
        txtPedidonull=(TextView)findViewById(R.id.txtPedido);
        txtTotal=(TextView)findViewById(R.id.txtTotal);
        Bundle bundle=this.getIntent().getExtras();
        txtPedidonull.setText(""+bundle.getString("pedido"));
        btnRegresar=(Button)findViewById(R.id.btnRegresar);
        Double total=Double.parseDouble(bundle.getString("pedido"))*7.50;
        txtTotal.setText(""+total);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Factura.this, MainActivity.class));

            }
        });
    }
}
