package org.redhat.solneng.jary.redis_connect;

import java.util.ArrayList;

public class BDBInstance {

    private float uid;
    private String authentication_sasl_uname;
    private boolean crdt;
    private boolean oss_cluster;
    private float backup_interval_offset;
    private String tls_mode;
    private String backup_failure_reason;
    private String replica_sync;
    private String sync;
    private String authentication_redis_pass;
    private String crdt_ghost_replica_ids;
    private float group_uid;
    private float memory_size;
    private float bigstore_ram_size;
    private String last_changed_time;
    private float max_aof_file_size;
    private String created_time;
    ArrayList<Object> authentication_ssl_crdt_certs = new ArrayList<>();
    ArrayList<Object> endpoints = new ArrayList<>();
    private boolean rack_aware;
    private boolean bigstore;
    private String crdt_guid;
    private float max_connections;
    ArrayList<Object> module_list = new ArrayList<>();
    ArrayList<Object> shard_list = new ArrayList<>();
    ArrayList<Object> sync_sources = new ArrayList<>();
    ArrayList<Object> crdt_sources = new ArrayList<>();
    ArrayList<Object> background_op = new ArrayList<>();
    private float port;
    private String version;
    private boolean email_alerts;
    private float max_aof_load_time;
    ArrayList<Object> authentication_ssl_client_certs = new ArrayList<>();
    private String eviction_policy;
    private String type;
    private String status;
    private float backup_history;
    private boolean implicit_shard_key;
    private String import_status;
    private String hash_slots_policy;
    private float backup_interval;
    ArrayList<Object> replica_sources = new ArrayList<>();
    ArrayList<Object> dataset_import_sources = new ArrayList<>();
    private float shards_count;
    ArrayList<Object> shard_key_regex = new ArrayList<>();
    private String shards_placement;
    private String data_persistence;
    private boolean replication;
    private String crdt_sync;
    private String oss_cluster_api_preferred_ip_type;
    private boolean sharding;
    private String authentication_admin_pass;
    private float backup_progress;
    private String name;
    private boolean ssl;
    private boolean backup;
    private String backup_status;
    private boolean crdt_causal_consistency;
    private String authentication_sasl_pass;
    ArrayList<Object> acl = new ArrayList<>();
    private String proxy_policy;
    private String import_failure_reason;
    private String crdt_replicas;
    private String aof_policy;
    ArrayList<Object> snapshot_policy = new ArrayList<>();
    private float crdt_replica_id;
    private String dns_address_master;
    private float import_progress;
    private float crdt_config_version;
    private boolean wait_command;


    // Getter Methods

    public float getUid() {
        return uid;
    }

    public String getAuthentication_sasl_uname() {
        return authentication_sasl_uname;
    }

    public boolean getCrdt() {
        return crdt;
    }

    public boolean getOss_cluster() {
        return oss_cluster;
    }

    public float getBackup_interval_offset() {
        return backup_interval_offset;
    }

    public String getTls_mode() {
        return tls_mode;
    }

    public String getBackup_failure_reason() {
        return backup_failure_reason;
    }

    public String getReplica_sync() {
        return replica_sync;
    }

    public String getSync() {
        return sync;
    }

    public String getAuthentication_redis_pass() {
        return authentication_redis_pass;
    }

    public String getCrdt_ghost_replica_ids() {
        return crdt_ghost_replica_ids;
    }

    public float getGroup_uid() {
        return group_uid;
    }

    public float getMemory_size() {
        return memory_size;
    }

    public float getBigstore_ram_size() {
        return bigstore_ram_size;
    }

    public String getLast_changed_time() {
        return last_changed_time;
    }

    public float getMax_aof_file_size() {
        return max_aof_file_size;
    }

    public String getCreated_time() {
        return created_time;
    }

    public boolean getRack_aware() {
        return rack_aware;
    }

    public boolean getBigstore() {
        return bigstore;
    }

    public String getCrdt_guid() {
        return crdt_guid;
    }

    public float getMax_connections() {
        return max_connections;
    }

    public float getPort() {
        return port;
    }

    public String getVersion() {
        return version;
    }

    public boolean getEmail_alerts() {
        return email_alerts;
    }

    public float getMax_aof_load_time() {
        return max_aof_load_time;
    }

    public String getEviction_policy() {
        return eviction_policy;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public float getBackup_history() {
        return backup_history;
    }

    public boolean getImplicit_shard_key() {
        return implicit_shard_key;
    }

    public String getImport_status() {
        return import_status;
    }

    public String getHash_slots_policy() {
        return hash_slots_policy;
    }

    public float getBackup_interval() {
        return backup_interval;
    }

    public float getShards_count() {
        return shards_count;
    }

    public String getShards_placement() {
        return shards_placement;
    }

    public String getData_persistence() {
        return data_persistence;
    }

    public boolean getReplication() {
        return replication;
    }

    public String getCrdt_sync() {
        return crdt_sync;
    }

    public String getOss_cluster_api_preferred_ip_type() {
        return oss_cluster_api_preferred_ip_type;
    }

    public boolean getSharding() {
        return sharding;
    }

    public String getAuthentication_admin_pass() {
        return authentication_admin_pass;
    }

    public float getBackup_progress() {
        return backup_progress;
    }

    public String getName() {
        return name;
    }

    public boolean getSsl() {
        return ssl;
    }

    public boolean getBackup() {
        return backup;
    }

    public String getBackup_status() {
        return backup_status;
    }

    public boolean getCrdt_causal_consistency() {
        return crdt_causal_consistency;
    }

    public String getAuthentication_sasl_pass() {
        return authentication_sasl_pass;
    }

    public String getProxy_policy() {
        return proxy_policy;
    }

    public String getImport_failure_reason() {
        return import_failure_reason;
    }

    public String getCrdt_replicas() {
        return crdt_replicas;
    }

    public String getAof_policy() {
        return aof_policy;
    }

    public float getCrdt_replica_id() {
        return crdt_replica_id;
    }

    public String getDns_address_master() {
        return dns_address_master;
    }

    public float getImport_progress() {
        return import_progress;
    }

    public float getCrdt_config_version() {
        return crdt_config_version;
    }

    public boolean getWait_command() {
        return wait_command;
    }

    // Setter Methods

    public void setUid(float uid) {
        this.uid = uid;
    }

    public void setAuthentication_sasl_uname(String authentication_sasl_uname) {
        this.authentication_sasl_uname = authentication_sasl_uname;
    }

    public void setCrdt(boolean crdt) {
        this.crdt = crdt;
    }

    public void setOss_cluster(boolean oss_cluster) {
        this.oss_cluster = oss_cluster;
    }

    public void setBackup_interval_offset(float backup_interval_offset) {
        this.backup_interval_offset = backup_interval_offset;
    }

    public void setTls_mode(String tls_mode) {
        this.tls_mode = tls_mode;
    }

    public void setBackup_failure_reason(String backup_failure_reason) {
        this.backup_failure_reason = backup_failure_reason;
    }

    public void setReplica_sync(String replica_sync) {
        this.replica_sync = replica_sync;
    }

    public void setSync(String sync) {
        this.sync = sync;
    }

    public void setAuthentication_redis_pass(String authentication_redis_pass) {
        this.authentication_redis_pass = authentication_redis_pass;
    }

    public void setCrdt_ghost_replica_ids(String crdt_ghost_replica_ids) {
        this.crdt_ghost_replica_ids = crdt_ghost_replica_ids;
    }

    public void setGroup_uid(float group_uid) {
        this.group_uid = group_uid;
    }

    public void setMemory_size(float memory_size) {
        this.memory_size = memory_size;
    }

    public void setBigstore_ram_size(float bigstore_ram_size) {
        this.bigstore_ram_size = bigstore_ram_size;
    }

    public void setLast_changed_time(String last_changed_time) {
        this.last_changed_time = last_changed_time;
    }

    public void setMax_aof_file_size(float max_aof_file_size) {
        this.max_aof_file_size = max_aof_file_size;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public void setRack_aware(boolean rack_aware) {
        this.rack_aware = rack_aware;
    }

    public void setBigstore(boolean bigstore) {
        this.bigstore = bigstore;
    }

    public void setCrdt_guid(String crdt_guid) {
        this.crdt_guid = crdt_guid;
    }

    public void setMax_connections(float max_connections) {
        this.max_connections = max_connections;
    }

    public void setPort(float port) {
        this.port = port;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setEmail_alerts(boolean email_alerts) {
        this.email_alerts = email_alerts;
    }

    public void setMax_aof_load_time(float max_aof_load_time) {
        this.max_aof_load_time = max_aof_load_time;
    }

    public void setEviction_policy(String eviction_policy) {
        this.eviction_policy = eviction_policy;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBackup_history(float backup_history) {
        this.backup_history = backup_history;
    }

    public void setImplicit_shard_key(boolean implicit_shard_key) {
        this.implicit_shard_key = implicit_shard_key;
    }

    public void setImport_status(String import_status) {
        this.import_status = import_status;
    }

    public void setHash_slots_policy(String hash_slots_policy) {
        this.hash_slots_policy = hash_slots_policy;
    }

    public void setBackup_interval(float backup_interval) {
        this.backup_interval = backup_interval;
    }

    public void setShards_count(float shards_count) {
        this.shards_count = shards_count;
    }

    public void setShards_placement(String shards_placement) {
        this.shards_placement = shards_placement;
    }

    public void setData_persistence(String data_persistence) {
        this.data_persistence = data_persistence;
    }

    public void setReplication(boolean replication) {
        this.replication = replication;
    }

    public void setCrdt_sync(String crdt_sync) {
        this.crdt_sync = crdt_sync;
    }

    public void setOss_cluster_api_preferred_ip_type(String oss_cluster_api_preferred_ip_type) {
        this.oss_cluster_api_preferred_ip_type = oss_cluster_api_preferred_ip_type;
    }

    public void setSharding(boolean sharding) {
        this.sharding = sharding;
    }

    public void setAuthentication_admin_pass(String authentication_admin_pass) {
        this.authentication_admin_pass = authentication_admin_pass;
    }

    public void setBackup_progress(float backup_progress) {
        this.backup_progress = backup_progress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }

    public void setBackup(boolean backup) {
        this.backup = backup;
    }

    public void setBackup_status(String backup_status) {
        this.backup_status = backup_status;
    }

    public void setCrdt_causal_consistency(boolean crdt_causal_consistency) {
        this.crdt_causal_consistency = crdt_causal_consistency;
    }

    public void setAuthentication_sasl_pass(String authentication_sasl_pass) {
        this.authentication_sasl_pass = authentication_sasl_pass;
    }

    public void setProxy_policy(String proxy_policy) {
        this.proxy_policy = proxy_policy;
    }

    public void setImport_failure_reason(String import_failure_reason) {
        this.import_failure_reason = import_failure_reason;
    }

    public void setCrdt_replicas(String crdt_replicas) {
        this.crdt_replicas = crdt_replicas;
    }

    public void setAof_policy(String aof_policy) {
        this.aof_policy = aof_policy;
    }

    public void setCrdt_replica_id(float crdt_replica_id) {
        this.crdt_replica_id = crdt_replica_id;
    }

    public void setDns_address_master(String dns_address_master) {
        this.dns_address_master = dns_address_master;
    }

    public void setImport_progress(float import_progress) {
        this.import_progress = import_progress;
    }

    public void setCrdt_config_version(float crdt_config_version) {
        this.crdt_config_version = crdt_config_version;
    }

    public void setWait_command(boolean wait_command) {
        this.wait_command = wait_command;
    }
}
