package play.modules.modelGen;

import org.apache.commons.lang.StringUtils;

import me.stormcat.maven.plugin.s2jdbcgen.meta.Table;

/**
 * ModelMetaクラス
 * @author n.kojima
 */
public class ModelMeta extends me.stormcat.maven.plugin.s2jdbcgen.ModelMeta {

	// DB種別
	private String dbType;

	/**
	 * コンストラクター
	 * @param table テーブル
	 */
	public ModelMeta(Table table) {
		super(table);
	}

	/**
	 * DB種別を取得する
	 * @return DB種別
	 */
	public String getDbType() {
		return this.dbType;
	}

	/**
	 * DB種別を設定する
	 * @param dbType DB種別
	 */
	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	/**
	 * DB種別パッケージ取得
	 * @return DB種別パッケージ
	 */
	public String getDbTypePackage() {
		return StringUtils.lowerCase(this.dbType);
	}
}
