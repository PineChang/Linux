// ORM class for table 'i_cp_req_cnt'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Jul 11 14:06:29 CST 2017
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class i_cp_req_cnt extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String platContentTypeSid;
  public String get_platContentTypeSid() {
    return platContentTypeSid;
  }
  public void set_platContentTypeSid(String platContentTypeSid) {
    this.platContentTypeSid = platContentTypeSid;
  }
  public i_cp_req_cnt with_platContentTypeSid(String platContentTypeSid) {
    this.platContentTypeSid = platContentTypeSid;
    return this;
  }
  private String platContentTypeCode;
  public String get_platContentTypeCode() {
    return platContentTypeCode;
  }
  public void set_platContentTypeCode(String platContentTypeCode) {
    this.platContentTypeCode = platContentTypeCode;
  }
  public i_cp_req_cnt with_platContentTypeCode(String platContentTypeCode) {
    this.platContentTypeCode = platContentTypeCode;
    return this;
  }
  private String platContentTypeName;
  public String get_platContentTypeName() {
    return platContentTypeName;
  }
  public void set_platContentTypeName(String platContentTypeName) {
    this.platContentTypeName = platContentTypeName;
  }
  public i_cp_req_cnt with_platContentTypeName(String platContentTypeName) {
    this.platContentTypeName = platContentTypeName;
    return this;
  }
  private String providerSid;
  public String get_providerSid() {
    return providerSid;
  }
  public void set_providerSid(String providerSid) {
    this.providerSid = providerSid;
  }
  public i_cp_req_cnt with_providerSid(String providerSid) {
    this.providerSid = providerSid;
    return this;
  }
  private String providerCode;
  public String get_providerCode() {
    return providerCode;
  }
  public void set_providerCode(String providerCode) {
    this.providerCode = providerCode;
  }
  public i_cp_req_cnt with_providerCode(String providerCode) {
    this.providerCode = providerCode;
    return this;
  }
  private String providerName;
  public String get_providerName() {
    return providerName;
  }
  public void set_providerName(String providerName) {
    this.providerName = providerName;
  }
  public i_cp_req_cnt with_providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }
  private Integer cp_total;
  public Integer get_cp_total() {
    return cp_total;
  }
  public void set_cp_total(Integer cp_total) {
    this.cp_total = cp_total;
  }
  public i_cp_req_cnt with_cp_total(Integer cp_total) {
    this.cp_total = cp_total;
    return this;
  }
  private java.sql.Date cp_date;
  public java.sql.Date get_cp_date() {
    return cp_date;
  }
  public void set_cp_date(java.sql.Date cp_date) {
    this.cp_date = cp_date;
  }
  public i_cp_req_cnt with_cp_date(java.sql.Date cp_date) {
    this.cp_date = cp_date;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof i_cp_req_cnt)) {
      return false;
    }
    i_cp_req_cnt that = (i_cp_req_cnt) o;
    boolean equal = true;
    equal = equal && (this.platContentTypeSid == null ? that.platContentTypeSid == null : this.platContentTypeSid.equals(that.platContentTypeSid));
    equal = equal && (this.platContentTypeCode == null ? that.platContentTypeCode == null : this.platContentTypeCode.equals(that.platContentTypeCode));
    equal = equal && (this.platContentTypeName == null ? that.platContentTypeName == null : this.platContentTypeName.equals(that.platContentTypeName));
    equal = equal && (this.providerSid == null ? that.providerSid == null : this.providerSid.equals(that.providerSid));
    equal = equal && (this.providerCode == null ? that.providerCode == null : this.providerCode.equals(that.providerCode));
    equal = equal && (this.providerName == null ? that.providerName == null : this.providerName.equals(that.providerName));
    equal = equal && (this.cp_total == null ? that.cp_total == null : this.cp_total.equals(that.cp_total));
    equal = equal && (this.cp_date == null ? that.cp_date == null : this.cp_date.equals(that.cp_date));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof i_cp_req_cnt)) {
      return false;
    }
    i_cp_req_cnt that = (i_cp_req_cnt) o;
    boolean equal = true;
    equal = equal && (this.platContentTypeSid == null ? that.platContentTypeSid == null : this.platContentTypeSid.equals(that.platContentTypeSid));
    equal = equal && (this.platContentTypeCode == null ? that.platContentTypeCode == null : this.platContentTypeCode.equals(that.platContentTypeCode));
    equal = equal && (this.platContentTypeName == null ? that.platContentTypeName == null : this.platContentTypeName.equals(that.platContentTypeName));
    equal = equal && (this.providerSid == null ? that.providerSid == null : this.providerSid.equals(that.providerSid));
    equal = equal && (this.providerCode == null ? that.providerCode == null : this.providerCode.equals(that.providerCode));
    equal = equal && (this.providerName == null ? that.providerName == null : this.providerName.equals(that.providerName));
    equal = equal && (this.cp_total == null ? that.cp_total == null : this.cp_total.equals(that.cp_total));
    equal = equal && (this.cp_date == null ? that.cp_date == null : this.cp_date.equals(that.cp_date));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.platContentTypeSid = JdbcWritableBridge.readString(1, __dbResults);
    this.platContentTypeCode = JdbcWritableBridge.readString(2, __dbResults);
    this.platContentTypeName = JdbcWritableBridge.readString(3, __dbResults);
    this.providerSid = JdbcWritableBridge.readString(4, __dbResults);
    this.providerCode = JdbcWritableBridge.readString(5, __dbResults);
    this.providerName = JdbcWritableBridge.readString(6, __dbResults);
    this.cp_total = JdbcWritableBridge.readInteger(7, __dbResults);
    this.cp_date = JdbcWritableBridge.readDate(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.platContentTypeSid = JdbcWritableBridge.readString(1, __dbResults);
    this.platContentTypeCode = JdbcWritableBridge.readString(2, __dbResults);
    this.platContentTypeName = JdbcWritableBridge.readString(3, __dbResults);
    this.providerSid = JdbcWritableBridge.readString(4, __dbResults);
    this.providerCode = JdbcWritableBridge.readString(5, __dbResults);
    this.providerName = JdbcWritableBridge.readString(6, __dbResults);
    this.cp_total = JdbcWritableBridge.readInteger(7, __dbResults);
    this.cp_date = JdbcWritableBridge.readDate(8, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(platContentTypeSid, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(platContentTypeCode, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(platContentTypeName, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(providerSid, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(providerCode, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(providerName, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(cp_total, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(cp_date, 8 + __off, 91, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(platContentTypeSid, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(platContentTypeCode, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(platContentTypeName, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(providerSid, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(providerCode, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(providerName, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(cp_total, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(cp_date, 8 + __off, 91, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.platContentTypeSid = null;
    } else {
    this.platContentTypeSid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.platContentTypeCode = null;
    } else {
    this.platContentTypeCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.platContentTypeName = null;
    } else {
    this.platContentTypeName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.providerSid = null;
    } else {
    this.providerSid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.providerCode = null;
    } else {
    this.providerCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.providerName = null;
    } else {
    this.providerName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cp_total = null;
    } else {
    this.cp_total = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cp_date = null;
    } else {
    this.cp_date = new Date(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.platContentTypeSid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, platContentTypeSid);
    }
    if (null == this.platContentTypeCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, platContentTypeCode);
    }
    if (null == this.platContentTypeName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, platContentTypeName);
    }
    if (null == this.providerSid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, providerSid);
    }
    if (null == this.providerCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, providerCode);
    }
    if (null == this.providerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, providerName);
    }
    if (null == this.cp_total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cp_total);
    }
    if (null == this.cp_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.cp_date.getTime());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.platContentTypeSid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, platContentTypeSid);
    }
    if (null == this.platContentTypeCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, platContentTypeCode);
    }
    if (null == this.platContentTypeName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, platContentTypeName);
    }
    if (null == this.providerSid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, providerSid);
    }
    if (null == this.providerCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, providerCode);
    }
    if (null == this.providerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, providerName);
    }
    if (null == this.cp_total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cp_total);
    }
    if (null == this.cp_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.cp_date.getTime());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(platContentTypeSid==null?"null":platContentTypeSid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(platContentTypeCode==null?"null":platContentTypeCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(platContentTypeName==null?"null":platContentTypeName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(providerSid==null?"null":providerSid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(providerCode==null?"null":providerCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(providerName==null?"null":providerName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cp_total==null?"null":"" + cp_total, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cp_date==null?"null":"" + cp_date, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(platContentTypeSid==null?"null":platContentTypeSid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(platContentTypeCode==null?"null":platContentTypeCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(platContentTypeName==null?"null":platContentTypeName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(providerSid==null?"null":providerSid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(providerCode==null?"null":providerCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(providerName==null?"null":providerName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cp_total==null?"null":"" + cp_total, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cp_date==null?"null":"" + cp_date, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.platContentTypeSid = null; } else {
      this.platContentTypeSid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.platContentTypeCode = null; } else {
      this.platContentTypeCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.platContentTypeName = null; } else {
      this.platContentTypeName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.providerSid = null; } else {
      this.providerSid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.providerCode = null; } else {
      this.providerCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.providerName = null; } else {
      this.providerName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cp_total = null; } else {
      this.cp_total = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cp_date = null; } else {
      this.cp_date = java.sql.Date.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.platContentTypeSid = null; } else {
      this.platContentTypeSid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.platContentTypeCode = null; } else {
      this.platContentTypeCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.platContentTypeName = null; } else {
      this.platContentTypeName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.providerSid = null; } else {
      this.providerSid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.providerCode = null; } else {
      this.providerCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.providerName = null; } else {
      this.providerName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cp_total = null; } else {
      this.cp_total = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cp_date = null; } else {
      this.cp_date = java.sql.Date.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    i_cp_req_cnt o = (i_cp_req_cnt) super.clone();
    o.cp_date = (o.cp_date != null) ? (java.sql.Date) o.cp_date.clone() : null;
    return o;
  }

  public void clone0(i_cp_req_cnt o) throws CloneNotSupportedException {
    o.cp_date = (o.cp_date != null) ? (java.sql.Date) o.cp_date.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("platContentTypeSid", this.platContentTypeSid);
    __sqoop$field_map.put("platContentTypeCode", this.platContentTypeCode);
    __sqoop$field_map.put("platContentTypeName", this.platContentTypeName);
    __sqoop$field_map.put("providerSid", this.providerSid);
    __sqoop$field_map.put("providerCode", this.providerCode);
    __sqoop$field_map.put("providerName", this.providerName);
    __sqoop$field_map.put("cp_total", this.cp_total);
    __sqoop$field_map.put("cp_date", this.cp_date);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("platContentTypeSid", this.platContentTypeSid);
    __sqoop$field_map.put("platContentTypeCode", this.platContentTypeCode);
    __sqoop$field_map.put("platContentTypeName", this.platContentTypeName);
    __sqoop$field_map.put("providerSid", this.providerSid);
    __sqoop$field_map.put("providerCode", this.providerCode);
    __sqoop$field_map.put("providerName", this.providerName);
    __sqoop$field_map.put("cp_total", this.cp_total);
    __sqoop$field_map.put("cp_date", this.cp_date);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("platContentTypeSid".equals(__fieldName)) {
      this.platContentTypeSid = (String) __fieldVal;
    }
    else    if ("platContentTypeCode".equals(__fieldName)) {
      this.platContentTypeCode = (String) __fieldVal;
    }
    else    if ("platContentTypeName".equals(__fieldName)) {
      this.platContentTypeName = (String) __fieldVal;
    }
    else    if ("providerSid".equals(__fieldName)) {
      this.providerSid = (String) __fieldVal;
    }
    else    if ("providerCode".equals(__fieldName)) {
      this.providerCode = (String) __fieldVal;
    }
    else    if ("providerName".equals(__fieldName)) {
      this.providerName = (String) __fieldVal;
    }
    else    if ("cp_total".equals(__fieldName)) {
      this.cp_total = (Integer) __fieldVal;
    }
    else    if ("cp_date".equals(__fieldName)) {
      this.cp_date = (java.sql.Date) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("platContentTypeSid".equals(__fieldName)) {
      this.platContentTypeSid = (String) __fieldVal;
      return true;
    }
    else    if ("platContentTypeCode".equals(__fieldName)) {
      this.platContentTypeCode = (String) __fieldVal;
      return true;
    }
    else    if ("platContentTypeName".equals(__fieldName)) {
      this.platContentTypeName = (String) __fieldVal;
      return true;
    }
    else    if ("providerSid".equals(__fieldName)) {
      this.providerSid = (String) __fieldVal;
      return true;
    }
    else    if ("providerCode".equals(__fieldName)) {
      this.providerCode = (String) __fieldVal;
      return true;
    }
    else    if ("providerName".equals(__fieldName)) {
      this.providerName = (String) __fieldVal;
      return true;
    }
    else    if ("cp_total".equals(__fieldName)) {
      this.cp_total = (Integer) __fieldVal;
      return true;
    }
    else    if ("cp_date".equals(__fieldName)) {
      this.cp_date = (java.sql.Date) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
