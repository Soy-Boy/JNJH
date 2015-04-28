package com.example.jnjh;

import java.util.ArrayList;
import java.util.HashMap;

import com.sharpandroid.service.DatabaseHelper;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class jinengzhuyeActivity extends Activity {
	Button fenlei;
	public SQLiteDatabase sq;
	private ListView list;
	public ArrayList<HashMap<String, String>> arr;
	public Integer id;
	public String jinengleibie;
	public static String wangjun;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jinengzhuye);
		fenlei = (Button) findViewById(R.id.fenlei);
		
		fenlei.setText("������ҳ");
		wangjun = "wangjun";
		Log.v("����", wangjun);
		shuju();
		
		fenlei.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				// ����popupWindow�Ĳ����ļ�
				View contentView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.popup, null);
				// ����popupWindow�ı�����ɫ
				contentView.setBackgroundColor(Color.RED);
				// ����һ��������
				final PopupWindow popupWindow = new PopupWindow(
						findViewById(R.id.shezhizhuyelayout),
						LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT,
						false);
				// Ϊ�������趨�Զ���Ĳ���
				popupWindow.setContentView(contentView);

				// ���ô˲�����ý��㣬�����޷����
				popupWindow.setFocusable(true);
				/*
				 * popupWindow.showAsDropDown��View view�������Ի���λ���ڽ�����view���
				 * showAsDropDown(View anchor, int xoff, int
				 * yoff)�����Ի���λ���ڽ�����view�����x y ������ƫ���� showAtLocation(View
				 * parent, int gravity, int x, int y)�����Ի��� parent ������ gravity
				 * ���������ֵ�λ����Gravity.CENTER x y ����ֵ
				 */

				if (popupWindow.isShowing()) {
					// ���ش��ڣ���������˵��������Сʱ������Ҫ�˷�ʽ����
					popupWindow.dismiss();
				} else {
					// ��ʾ����
					popupWindow.showAsDropDown(fenlei);
				}

				Button quanbu = (Button) contentView.findViewById(R.id.quanbu);
				quanbu.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("������ҳ");
						wangjun = "wangjun";
						Log.v("����", wangjun);
						shuju();
					}
				});
				Button shouqi = (Button) contentView.findViewById(R.id.shouqi);
				shouqi.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();

					}
				});
				final Button yingyu = (Button) contentView
						.findViewById(R.id.yingyu);
				yingyu.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("Ӣ��");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();
					}
				});

				Button riyu = (Button) contentView.findViewById(R.id.riyu);
				riyu.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("����");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button fayu = (Button) contentView.findViewById(R.id.fayu);
				fayu.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("����");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button deyu = (Button) contentView.findViewById(R.id.deyu);
				deyu.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("����");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button eyu = (Button) contentView.findViewById(R.id.eyu);
				eyu.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("����");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button hanyu = (Button) contentView.findViewById(R.id.hanyu);
				hanyu.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("����");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});

				Button qiulei = (Button) contentView.findViewById(R.id.qiulei);
				qiulei.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("����");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button jianmei = (Button) contentView
						.findViewById(R.id.jianmeiwushu);
				jianmei.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("��������");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button qipai = (Button) contentView.findViewById(R.id.qipai);
				qipai.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("����");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button lunhua = (Button) contentView.findViewById(R.id.lunhua);
				lunhua.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("�˶��ֻ�");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button gechang = (Button) contentView
						.findViewById(R.id.gechang);
				gechang.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("�質�ݽ�");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button wudao = (Button) contentView.findViewById(R.id.wudao);
				wudao.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("�赸");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button shuhua = (Button) contentView.findViewById(R.id.shuhua);
				shuhua.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("�黭��Ӱ");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();
					}
				});
				Button xiqu = (Button) contentView.findViewById(R.id.xiqu);
				xiqu.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("Ϸ������");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button biaoyan = (Button) contentView
						.findViewById(R.id.biaoyan);
				biaoyan.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("����");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button dongman = (Button) contentView
						.findViewById(R.id.dongman);
				dongman.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("����");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button pengren = (Button) contentView
						.findViewById(R.id.pengren);
				pengren.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("���");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button shougong = (Button) contentView
						.findViewById(R.id.shougong);
				shougong.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("�ֹ�");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button weixiu = (Button) contentView.findViewById(R.id.weixiu);
				weixiu.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("ά��");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button dianzi = (Button) contentView.findViewById(R.id.dianzi);
				dianzi.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("��������");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button shishang = (Button) contentView
						.findViewById(R.id.shishang);
				shishang.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("ʱ�д���");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button huazhuang = (Button) contentView
						.findViewById(R.id.huazhuang);
				huazhuang.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("��ױ����");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button xinli = (Button) contentView.findViewById(R.id.xinli);
				xinli.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("����");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();
					}
				});
				Button biancheng = (Button) contentView
						.findViewById(R.id.biancheng);
				biancheng.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("�������");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button shiping = (Button) contentView
						.findViewById(R.id.shiping);
				shiping.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("��Ƶ����");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button tuxiang = (Button) contentView
						.findViewById(R.id.tuxiang);
				tuxiang.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("ͼ����");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button ruanjian = (Button) contentView
						.findViewById(R.id.ruanjian);
				ruanjian.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("���ϵͳ");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button shujuku = (Button) contentView
						.findViewById(R.id.shujuku);
				shujuku.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("���ݿ�");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button web = (Button) contentView.findViewById(R.id.web);
				web.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("web����");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
				Button dianziweixiu = (Button) contentView
						.findViewById(R.id.dianziweixiu);
				dianziweixiu.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("����ά��");
						wangjun = fenlei.getText().toString();
						Log.v("����", wangjun);
						shuju();

					}
				});
			}
		});
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>��ת����
		Button shezhishezhi = (Button) findViewById(R.id.shezhishezhi);
		shezhishezhi.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(jinengzhuyeActivity.this,shezhizhuyeActivity.class);
				startActivity(intent);
				jinengzhuyeActivity.this.finish();
			}
		});
		Button shezhiguanzhu = (Button) findViewById(R.id.shezhiguanzhu);
		shezhiguanzhu.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(jinengzhuyeActivity.this,stxiaoxinpingtaiActivity.class);
				startActivity(intent);
				jinengzhuyeActivity.this.finish();
			}
		});
		Button shezhigeren = (Button) findViewById(R.id.shezhigeren);
		shezhigeren.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(jinengzhuyeActivity.this,gerenzhuyeActivity.class);
				startActivity(intent);
				jinengzhuyeActivity.this.finish();
			}
		});
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>��ת����
	}

	public void shuju() {
		jinengleibie = wangjun;
		list = (ListView) findViewById(R.id.list);
		// ��ѯ���ݿ����������
		DatabaseHelper dbHelper = new DatabaseHelper(this);
		sq = dbHelper.getReadableDatabase();
		final Cursor cs;
		jinengzhuyeActivity shezhi = new jinengzhuyeActivity();
		Log.v("2222", shezhi.wangjun);
		String wang = "wangjun";
		if ("wangjun".equals(shezhi.wangjun)) {
			Log.v("sql���", "1111111");
			cs = sq.rawQuery("select id, name,jianjie,inSort_2 from sort3",
					new String[] {});
		} else {
			Log.v("sql���2", "1111111");
			cs = sq.rawQuery(
					"select id, name,jianjie,inSort_2 from sort3 where inSort_2=?",
					new String[] { String.valueOf(jinengleibie) });
		}
		list.setAdapter(new CursorAdapter(this, cs));

		list.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				cs.moveToPosition(position);
				String name = cs.getString(cs.getColumnIndex("name"));
				String jianjie = cs.getString(cs.getColumnIndex("jianjie"));
				Toast.makeText(getApplicationContext(), "��ѡ����" + name + "��",
						Toast.LENGTH_SHORT).show();
				Intent intent = new Intent();
				Bundle bundle = new Bundle();
				bundle.putString("jinengname", name);
				bundle.putString("jinengjianjie", jianjie);
				intent.putExtras(bundle);
				intent.setClass(jinengzhuyeActivity.this,jinengjieshaoActivity.class);
				startActivity(intent);
			}

		});
	}
}
