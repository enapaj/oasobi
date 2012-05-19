package jp.co.chancelab.games.runpeace;

import com.badlogic.gdx.math.Vector2;

public class GameStatus {

	// スコア
	public double mScore = 0D;
	// ハイスコア
	public double mHiScore = 100000D;
	// ステージ
	public int mStage = 1;
	// プレイヤー座標
	public Vector2 mPlayerVector;
	// MAP座標
	public Vector2 mMapVector;
}
