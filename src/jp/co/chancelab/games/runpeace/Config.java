package jp.co.chancelab.games.runpeace;

import com.badlogic.gdx.math.Vector2;

public class Config {

	// サウンドのON/OFF
	private boolean isMusic = true;
	// SEのON/OFF
	private boolean isSoundEffects = true;
	// 重力
	private Vector2 mGravity = new Vector2(0f, 0.98f);

	public boolean isDoMusic() {
		return this.isMusic;
	}

	public void setDoMusic(boolean isMusic) {
		this.isMusic = isMusic;
	}

	public boolean isDoSoundEffects() {
		return this.isSoundEffects;
	}

	public void setDoSoundEffects(boolean isSoundEffects) {
		this.isSoundEffects = isSoundEffects;
	}

	public Vector2 getmGravity() {
		return this.mGravity;
	}

	public void setmGravity(Vector2 mGravity) {
		this.mGravity = mGravity;
	}

}
