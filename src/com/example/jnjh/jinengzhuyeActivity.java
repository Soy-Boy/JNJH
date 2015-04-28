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
		
		fenlei.setText("技能主页");
		wangjun = "wangjun";
		Log.v("王骏", wangjun);
		shuju();
		
		fenlei.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				// 加载popupWindow的布局文件
				View contentView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.popup, null);
				// 设置popupWindow的背景颜色
				contentView.setBackgroundColor(Color.RED);
				// 声明一个弹出框
				final PopupWindow popupWindow = new PopupWindow(
						findViewById(R.id.shezhizhuyelayout),
						LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT,
						false);
				// 为弹出框设定自定义的布局
				popupWindow.setContentView(contentView);

				// 设置此参数获得焦点，否则无法点击
				popupWindow.setFocusable(true);
				/*
				 * popupWindow.showAsDropDown（View view）弹出对话框，位置在紧挨着view组件
				 * showAsDropDown(View anchor, int xoff, int
				 * yoff)弹出对话框，位置在紧挨着view组件，x y 代表着偏移量 showAtLocation(View
				 * parent, int gravity, int x, int y)弹出对话框 parent 父布局 gravity
				 * 依靠父布局的位置如Gravity.CENTER x y 坐标值
				 */

				if (popupWindow.isShowing()) {
					// 隐藏窗口，如果设置了点击窗口外小时即不需要此方式隐藏
					popupWindow.dismiss();
				} else {
					// 显示窗口
					popupWindow.showAsDropDown(fenlei);
				}

				Button quanbu = (Button) contentView.findViewById(R.id.quanbu);
				quanbu.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("技能主页");
						wangjun = "wangjun";
						Log.v("王骏", wangjun);
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
						fenlei.setText("英语");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();
					}
				});

				Button riyu = (Button) contentView.findViewById(R.id.riyu);
				riyu.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("日语");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button fayu = (Button) contentView.findViewById(R.id.fayu);
				fayu.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("法语");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button deyu = (Button) contentView.findViewById(R.id.deyu);
				deyu.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("德语");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button eyu = (Button) contentView.findViewById(R.id.eyu);
				eyu.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("俄语");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button hanyu = (Button) contentView.findViewById(R.id.hanyu);
				hanyu.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("韩语");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});

				Button qiulei = (Button) contentView.findViewById(R.id.qiulei);
				qiulei.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("球类");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button jianmei = (Button) contentView
						.findViewById(R.id.jianmeiwushu);
				jianmei.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("健美武术");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button qipai = (Button) contentView.findViewById(R.id.qipai);
				qipai.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("棋牌");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button lunhua = (Button) contentView.findViewById(R.id.lunhua);
				lunhua.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("运动轮滑");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button gechang = (Button) contentView
						.findViewById(R.id.gechang);
				gechang.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("歌唱演讲");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button wudao = (Button) contentView.findViewById(R.id.wudao);
				wudao.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("舞蹈");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button shuhua = (Button) contentView.findViewById(R.id.shuhua);
				shuhua.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("书画摄影");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();
					}
				});
				Button xiqu = (Button) contentView.findViewById(R.id.xiqu);
				xiqu.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("戏曲乐器");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button biaoyan = (Button) contentView
						.findViewById(R.id.biaoyan);
				biaoyan.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("表演");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button dongman = (Button) contentView
						.findViewById(R.id.dongman);
				dongman.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("动漫");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button pengren = (Button) contentView
						.findViewById(R.id.pengren);
				pengren.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("烹饪");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button shougong = (Button) contentView
						.findViewById(R.id.shougong);
				shougong.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("手工");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button weixiu = (Button) contentView.findViewById(R.id.weixiu);
				weixiu.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("维修");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button dianzi = (Button) contentView.findViewById(R.id.dianzi);
				dianzi.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("电子娱乐");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button shishang = (Button) contentView
						.findViewById(R.id.shishang);
				shishang.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("时尚搭配");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button huazhuang = (Button) contentView
						.findViewById(R.id.huazhuang);
				huazhuang.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("化妆美容");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button xinli = (Button) contentView.findViewById(R.id.xinli);
				xinli.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("心理");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();
					}
				});
				Button biancheng = (Button) contentView
						.findViewById(R.id.biancheng);
				biancheng.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("编程语言");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button shiping = (Button) contentView
						.findViewById(R.id.shiping);
				shiping.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("视频制作");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button tuxiang = (Button) contentView
						.findViewById(R.id.tuxiang);
				tuxiang.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("图像处理");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button ruanjian = (Button) contentView
						.findViewById(R.id.ruanjian);
				ruanjian.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("软件系统");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button shujuku = (Button) contentView
						.findViewById(R.id.shujuku);
				shujuku.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("数据库");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button web = (Button) contentView.findViewById(R.id.web);
				web.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("web技术");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
				Button dianziweixiu = (Button) contentView
						.findViewById(R.id.dianziweixiu);
				dianziweixiu.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
						fenlei.setText("电子维修");
						wangjun = fenlei.getText().toString();
						Log.v("王骏", wangjun);
						shuju();

					}
				});
			}
		});
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>跳转功能
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
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>跳转功能
	}

	public void shuju() {
		jinengleibie = wangjun;
		list = (ListView) findViewById(R.id.list);
		// 查询数据库里面的内容
		DatabaseHelper dbHelper = new DatabaseHelper(this);
		sq = dbHelper.getReadableDatabase();
		final Cursor cs;
		jinengzhuyeActivity shezhi = new jinengzhuyeActivity();
		Log.v("2222", shezhi.wangjun);
		String wang = "wangjun";
		if ("wangjun".equals(shezhi.wangjun)) {
			Log.v("sql语句", "1111111");
			cs = sq.rawQuery("select id, name,jianjie,inSort_2 from sort3",
					new String[] {});
		} else {
			Log.v("sql语句2", "1111111");
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
				Toast.makeText(getApplicationContext(), "你选择了" + name + "。",
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
