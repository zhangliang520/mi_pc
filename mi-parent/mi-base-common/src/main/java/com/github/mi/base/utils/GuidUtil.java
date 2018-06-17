/*
 * 文件名：GuidUtil.java 版权：© Copyright 2012-2018 广州宝锶信息技术有限公司 创建人：胡宝忠 创建时间：2016年5月5日13:59:38 修改人： 修改时间：
 * 需改内容：
 * 
 */
package com.github.mi.base.utils;

import java.util.UUID;

/**
 * 
 * GUID工具类<br>
 * 生成GUID的工具类<br>
 * 
 * @author 胡宝忠
 * @version 1.0，2016年5月7日 下午1:07:58
 * @since oyjt-service1.0
 */
public class GuidUtil {

  /**
   * 生成GUID<br>
   * 生成GUID,用于数据库主键<br>
   * 
   * @return
   */
  public static String getGuid() {
    return replace(UUID.randomUUID().toString(), "-", "");
  }

  /**
   * 替换字符<br>
   * 替换字符<br>
   * 
   * @param strSource 原字符串
   * @param strFrom 待替换的字符串
   * @param strTo 替换的字符串
   * @return 新的字符串
   */
  private static String replace(String strSource, String strFrom, String strTo) {
    if (strSource == null) {
      return null;
    }
    int i = 0;
    if ((i = strSource.indexOf(strFrom, i)) >= 0) {
      char[] cSrc = strSource.toCharArray();
      char[] cTo = strTo.toCharArray();
      int len = strFrom.length();
      StringBuffer buf = new StringBuffer(cSrc.length);
      buf.append(cSrc, 0, i).append(cTo);
      i += len;
      int j = i;
      while ((i = strSource.indexOf(strFrom, i)) > 0) {
        buf.append(cSrc, j, i - j).append(cTo);
        i += len;
        j = i;
      }
      buf.append(cSrc, j, cSrc.length - j);
      return buf.toString();
    }
    return strSource;
  }
}
