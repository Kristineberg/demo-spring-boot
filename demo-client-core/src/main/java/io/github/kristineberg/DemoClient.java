package io.github.kristineberg;

import lombok.NoArgsConstructor;

/**
 * 示例客户端
 *
 * @author william@StarImmortal
 * @date 2023/06/14
 */
@NoArgsConstructor
public class DemoClient {

	/**
	 * 密钥
	 */
	private String key;

	/**
	 * 签名校验
	 */
	private String sign;

	public DemoClient(String key) {
		this.key = key;
	}

	public DemoClient(String key, String sign) {
		this.key = key;
		this.sign = sign;
	}

}
