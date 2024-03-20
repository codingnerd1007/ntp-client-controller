package org.example.ntp.util;

//import org.joda.time.format.DateTimeFormat;
//import org.joda.time.format.DateTimeFormatter;

public interface ExampleOrgSDKConstants
{

    //Test Mode
    boolean TEST_MODE = false;

    short MOTADATA_SYSTEM_USER = -2;

    //basic  constants

    String CONFIG_DB = "configdb";

    String SOURCE_HOST = "source_host";

    String SOURCE_TYPE = "source_type";

    String MESSAGE_UUID = "message_uuid";

    String LOG_MODEL_FULL_TEXT_SEARCH = "full-text-search";

    String DATA_MODEL_NAME = "data_model_name";

    String ALERT_CORRELATION_RESULT = "alert_correlation_result";

    String TIME_STAMP = "timestamp";

    String RECEIVED_TIME_STAMP = "received_timestamp";

    String RAW_MESSAGE = "message";

    String MONITOR_ID = "monitor_id";

    String BUSINESS_SERVICE_ID = "business_service_id";

    String MONITOR_NAME = "monitor-name";

    String MONITOR_CONTEXT = "monitor-context";

    String AVAILABILITY = "Availability";

    String MONITOR_METRIC_POLLING_CONTEXT = "monitor-polling-context";

    String MONITOR_TYPE = "monitor-type";

    String METRIC = "metric-name";

    String METRIC_VALUE = "metric-value";

    String INSTANCE = "instance";

    String ALERT_INSTANCES = "instances";

    String INSTANCE_METRIC_FIELD = "instance-metric-field";

    String REASON = "reason";

    String INTERFACE = "interface";

    String COLUMN_TYPE_STRING = "String";

    String COLUMN_TYPE_NUMERIC = "Numeric";

    String COLUMN_TYPE_DOUBLE = "Double";

    String COLUMN_TYPE_DATE = "Date";

    String COLUMN_TYPE_DATE_TIME = "DateTime";

    String TABLE_AVAILABILITY = "tbl_availability";

    String TABLE_REACHABILITY = "tbl_reachability";

    String TABLE_INTERFACE_AVAILABILITY = "tbl_interface_availability";

    String TABLE_METRIC = "tbl_metric";

    String TABLE_METRIC_INSTANCE = "tbl_instance_metric";

    String TABLE_METRIC_INSTANCE_VIEW = "tbl_instance_metric_view";

    String TABLE_ALERT_DURATION = "tbl_alert_duration";

    String TABLE_MOTADATA_HEALTH = "tbl_motadata_health";

    String TABLE_MOTADATA_RPE_HEALTH = "tbl_motadata_rpe_health";

    String TABLE_AGGREGATED_AVAILABILITY = "tbl_aggregated_availability";

    String TABLE_METRIC_POLLING_INFO_BUFFER = "tbl_metric_polling_info_buffer";

    String TABLE_NCM_COMPLIANCE_REPORT = "tbl_ncm_compliance_report";

    String TABLE_NCM_COMPLIANCE_REPORT_VIEW = "tbl_ncm_compliance_report_view";

    String TABLE_JMS_ALERT = "tbl_jms_alert";

    String TABLE_BUFFER_JMS_ALERT = "tbl_jms_alert_buffer";

    String METRIC_NAME = "metric_name";

    String METRIC_STRING_VALUE = "metric_string_value";

    String METRIC_NUMERIC_VALUE = "metric_numeric_value";

    String METRIC_INSTANCE_NAME = "instance_name";

    String COLUMN_NAME = "name";

    String COLUMN_RPE_ID = "rpe_id";

    String COLUMN_STRING_VALUE = "string_value";

    String COLUMN_NUMERIC_VALUE = "numeric_value";

    String DURATION = "duration";

    String TIME_DIFFERENCE = "time_difference";


    String LAST_SEEN = "last-seen";

    String TIME_ZONE = "timezone";

    String EVENT_DATE = "event_date";

    String EVENT_TIME = "event_time";

    String _TIME = "_time";

    String INDEX_NAME_FORMAT = "yyyyMMdd";

    String MARIA_DB_TABLE_NAME_FORMAT = "yyyy_MM_dd";

    //mail sever context constants

    String PRIMARY_MAIL_SERVER_CONTEXT = "primary-mail-server-context";

    String SECONDARY_MAIL_SERVER_CONTEXT = "secondary-mail-server-context";

    String MAIL_SERVER_HOST = "mail-server-host";

    String MAIL_SERVER_PORT = "mail-server-port";

    String MAIL_SERVER_USER = "mail-server-user";

    String MAIL_SERVER_PASSWORD = "mail-server-password";

    String MAIL_SERVER_SECURITY = "mail-server-security";

    String MAIL_SERVER_SENDER_EMAIL = "mail-server-sender-email";

    String MAIL_SERVER_CONTEXT_REQUIRE = "mail-server-context-require";


    String NCM_BACKUP_FILE = "backup-file";

    String NCM_RESTORE_FILE = "restore-file";

    String WAIT_HANDLER = "wait-handler";

    //notification constants

    String ALERT_CONTEXT = "alert-context";

    String NCM_CREDENTIALS_TEST_CHANNEL = "ncm_credentials_test_discovery";

    String MONITOR_REDISCOVER_INTERFACE_CHANNEL = "monitor_rediscover_interface";

    String ALERT_CONTEXT_REQUIRE = "alert-context-require";

    String TROUBLE_TICKET_REQUIRED = "is-trouble-ticket-action";

    String TROUBLE_TICKET_VIEW_CHANNEL = "trouble_ticket_view_channel";

    String TROUBLE_TICKET_VIEW_REQUEST = "trouble_ticket_view_request";

    String ALERT_ID = "alert-id";

    String ALERT_TRIGGERED_TIME = "alert-triggered-time";

    String ALERT_NAME = "alert-name";

    String ALERT_SEVERITY_ID = "alert-severity-id";

    String ALERT_SEVERITY_ORDER = "alert-severity-order";

    String ALERT_SEVERITY_DESCRIPTION = "alert-severity-description";

    String ALERT_SEVERITY_CONTEXT = "alert-severity-context";

    String ALERT_MESSAGE = "alert-message";

    String ALERT_TITLE = "alert-title";

    String ALERT_RCA = "alert-rca";

    String ALERT_RESOURCE = "alert-resource";

    String ALERT_STREAM_TYPE = "alert-stream-type";

    String SEARCH_RESULT_REQUIRE = "search-result-require";

    String SEARCH_RESULT = "search-result";

    String PLUGIN_RESULT = "plugin-result";


    String ALERT_STREAM_OPERATION_PLUGIN_ID = "alert-stream-operation";


    String ALERT_STREAM_OPERATION_ID = "alert-stream-id";

    String ALERT_STREAM_OPERATION_MESSAGE = "alert-stream-message";

    String ALERT_STREAM_OPERATION_USER = "alert-stream-user";

    String ALERT_STREAM_OPERATION = "alert-stream-operation";

    String ALERT_CORRELATION_WORKER_TOPIC_NAME = "alert_correlation_requests";

    String ALERT_CORRELATION_CHANNEL_NAME = "alert_correlation";

    //sdk util constants

    String CURRENT_DIR = System.getProperty("user.dir");

    String PATH_SEPARATOR = System.getProperty("file.separator");

    String NEW_LINE = System.lineSeparator();

    String NUMERIC_REGEX_PATTERN = "[0-9]+";

    String DOUBLE_REGEX_PATTERN = "(\\d*\\.\\d+)";

    String EXPONENTIAL_REGEX_PATTERN = "(\\d+.\\d+E.*)";

    String MAIL_SERVER_SECURITY_TLS = "tls";

    String MAIL_SERVER_SECURITY_SSL = "ssl";

    int MAIL_SERVER_DEFAULT_TIME_OUT = 60;

    String YES = "yes";

    String NO = "no";


    //plugin constants

    String PLUGIN_ID = "plugin-id";

    String PLUGIN_CATEGORY = "plugin-category";

    String PLUGIN_ICON = "plugin-icon";

    String PLUGIN_TOPOLOGY_ICON = "plugin-topology-icon";

    String PLUGIN_VERSION = "plugin-version";

    String PLUGIN_AUTHOR = "plugin-author";

    String PLUGIN_STATUS = "plugin-status";

    String PLUGIN_VENDOR = "plugin-vendor";

    String PLUGIN_METRICS = "plugin-metrics";

    String PLUGIN_NAME = "plugin-name";

    String PLUGIN_CLASS = "plugin-class";

    String PLUGIN_FILE = "plugin.yml";

    String PLUGIN_CONTEXT = "plugin-context";

    String PLUGIN_CONTEXT_ID = "plugin-context-id";

    String PLUGIN_LOCATION = "plugin-location";

    String PLUGIN_MULTIPLE_INSTANCE = "plugin-multiple-instance";

    String PLUGIN_WARNING_MESSAGE = "plugin-warning-message";

    String PLUGIN_INFO_MESSAGE = "plugin-info-message";

    String PLUGIN_SCHEDULER = "plugin-scheduler";

    String PLUGIN_METRIC_COLLECT_TIMEOUT = "metric-collect-timeout";

    String PLUGIN_NMAP_PING = "nmap-ping";

    String PLUGIN_AVAILABILITY_BY = "availability-by";

    String PLUGIN_PING_PACKET_SIZE = "ping-packetsize";

    String PLUGIN_OPERATION_TYPE = "plugin-operation-type";

    String SNMP = "SNMP";

    String PING = "Ping";

    String PLUGIN_DATA_MODEL_SOURCES = "plugin-data-model-sources";

    String PLUGIN_DIR = "plugins";

    String PLUGIN_CORRELATED_ACTION = "correlated-action";

    String PLUGIN_AUTO_CLEAR_ACTION = "auto-clear-action";

    String PLUGIN_LEVEL = "plugin-level";

    String PLUGIN_LOG_PARSER_DIR = "log-parser";

    String PLUGIN_JOB_DIR = "job";

    String PLUGIN_STREAM_LISTENER_DIR = "stream-listener";

    String PLUGIN_LOG_COLLECTOR_DIR = "log-collector";

    String PLUGIN_ACTION_DIR = "action";

    String PLUGIN_FLOW_PARSER_DIR = "flow-parser";

    String PLUGIN_METRIC_COLLECTOR_DIR = "metric-collector";

    String PLUGIN_OUTPUT_WRITER_DIR = "output-writer";

    String PLUGIN_NCM_COLLECTOR_DIR = "ncm-collector";

    String PLUGIN_WHITE_SPACE_FIELD_ANALYZER = "whitespace-field-analyzer";

    String PLUGIN_STANDARD_FIELD_ANALYZER = "standard-field-analyzer";

    String PLUGIN_PING_CHECK_REQUIRED = "ping-check-required";

    String PLUGIN_MULTI_VALUE_FIELDS = "multi-value-fields";


    String PLUGIN_IPV4_ADDRESS_FIELD = "ipv4-address-field";

    String PLUGIN_LOG_PATTERN = "plugin-log-pattern";

    String PLUGIN_GROK_PATTERN = "plugin-grok-pattern";

    String PLUGIN_CONTEXT_DETAILS = "plugin-context-details";

    String PLUGIN_CREDENTIAL_FIELDS = "credential-fields";

    String PLUGIN_CONTEXT_DETAILS_FILE = "plugin-context-details.yml";


    String BUSINESS_HOUR_ID = "business_hour_id";

    String PLUGIN_PARAMETERS = "plugin-params";

    short BUSINESS_HOUR = 0;

    short BUSINESS_MINUTE = 1;


    String OTHER_PLUGIN_ID = "other";

    String ALERT_DATA_MODEL = "Alert";

    String METRIC_DATA_MODEL = "Metric";

    //plugin exception message

    String ERROR_PLUGIN_DIR_NOT_FOUND = "Plugin directory not found";

    String ERROR_PLUGIN_DESCRIPTOR_FILE_NOT_VALID = "Invalid plugin.yml file";

    String ERROR_PLUGIN_CLASS_NOT_FOUND = "Plugin main class not found";

    String ERROR_PLUGIN_DIR_EMPTY = "Plugin directory is empty";

    String ERROR_PLUGIN_CLASS_LOADING_ERROR = "Error while loading plugin main class";

    String ERROR_PLUGIN_NOT_FOUND = "Plugin not found. Please check plugin.yml and plugin jar";

    String SUCCESS = "success";

    String FAILED = "failed";

    //polling constants
    String REQUEST_EVENT_DATE= "request-event-date";

    String RESPONSE_EVENT_DATE= "response-event-date";

    String METRIC_DURATION= "metric-duration";

    String DATE_KEY = "date_key";

    String LANE_CHANGE_FLAP = "lane-change-flap";
    //geo ip constant

    String GEO_DB_PATH = "geoip-db";

    String GEO_IP_CITY_DB_FILE = "GeoLite2-City.mmdb";
    String DISABLED = "disabled";
    String ENABLED = "enabled";
    short FALSE = 0;
    short TRUE = 1;
    String LINK_SEPARATOR = "|!!|";
    String LINK_SEPARATOR_WITH_ESCAPE = "\\|!!\\|";
    String VALUE_TYPE_SEPARATOR = "_@#_";
    String VALUE_SEPARATOR = "_|@#|_";
    String VALUE_SEPARATOR_WITH_ESCAPE = "_\\|@#\\|_";
    String ROW_SEPARATOR = "_|##|_";
    String ROW_SEPARATOR_WITH_ESCAPE = "_\\|##\\|_";
    String ALERT_CONTEXT_SEPARATOR = "|@_@|";
    String ALERT_CONTEXT_SEPARATOR_WITH_ESCAPE = "\\|@_@\\|";
    String ALERT_LAST_SEEN_SEPARATOR = "|#_#|";
    String ALERT_LAST_SEEN_SEPARATOR_WITH_ESCAPE = "\\|#_#\\|";

    String ALERT_CORRELATION_SEPARATOR = "|#@_@#|";
    String ALERT_CORRELATION_WITH_ESCAPE = "\\|#@_@#\\|";

    short NET_FLOW_VERSION_5 = 5;

    String CALCULATE_BY_UPTIME = "calculate-by-uptime";
    String UP_TIME = "Up-Time";
    String SHOW_OVER_UTILIZATION = "show-over-utilization";
    String RATE_CALCULATION_BY = "rate-calculation-by";


    // flow parsers common const

    //version constants
    short NET_FLOW_VERSION_9 = 9;
    short SFLOW_VERSION_5 = 5;
    short IPFIX = 10;
    String CONFIG_DIR = "config";


    //config constants
    String DEVICE_SIGNATURE_DIR = "device-signature";
    String NSQ_CONFIG = "nsq-conf.yml";
    String REDIS_SERVER_CONFIG = "redis-conf.yml";
    String MOTADATA_CONFIG = "motadata-conf.yml";
    String SAML_SSO_CONFIG = "saml-sso-conf.yml";
    String DB_ENGINE = "db-engine-conf.yml";
    String ES_CONFIG = "elastic-search-conf.yml";
    String SPHINX_CONFIG = "sphinx-search-conf.yml";
    String H2_CONFIG = "h2-conf.yml";
    String CLUSTER_CONFIG = "cluster-conf.yml";
    String JETTY_CONFIG = "jetty-conf.yml";
    String SYSTEM_CONFIG = "system-conf.yml";
    String TERMINAL_LENGTH = "terminal-length.yml";
    String OBSERVER_CONFIG = "observer-conf.yml";
    String SNMP_DEVICES_CONFIG = "snmp-devices.yml";
    String PLUGIN_CONTEXT_RESOLVER_CONFIG_FILE = "plugin-context-resolver.yml";
    String RPE_SERVER_CONFIG = "rpe-conf.yml";
    String NCM_CONFIG = "ncm-conf.yml";
    String PLUGIN_ALLOW_DUPLICATE = "allow-duplicate";
    String PLUGIN_CUSTOM_TYPE = "custom-plugin";
    String WORK_TYPE = "work-type";




    //work constants
    String WORK_CONTEXT = "work-context";
    String WORK_CONTEXT_PARAMS = "work-context-params";
    String WORK_REQUEST_ID = "work-request-id";
    String WORK_PLUGIN_CONTEXT_RESOLVER = "work-plugin-context-resolver";
    String METRIC_WORKER_TOPIC_NAME = "metrics";
    String METRIC_WORKER_CHANNEL_NAME = "metric_collection";
    String LOG_ANALYZER_PARSER_TOPIC_NAME = "logs";
    String LOG_ANALYZER_PARSER_CHANNEL_NAME = "log_analysis";
    String LOG_ANALYZER_STREAM_TOPIC_NAME = "log_stream";
    String LOG_ANALYZER_STREAM_CHANNEL_NAME = "log_collection";
    String FLOW_ANALYZER_WORKER_TOPIC_NAME = "flows";
    String FLOW_ANALYZER_WORKER_CHANNEL_NAME = "flow_analysis";
    String FLOW_COLLECTOR_WORKER_TOPIC_NAME = "analyzed_flows";
    String FLOW_COLLECTOR_WORKER_CHANNEL_NAME = "flow_collection";
    String METRIC_DOWN_STREAM_WORKER_TOPIC_NAME = "down_stream_metrics";
    String METRIC_DOWN_STREAM_WORKER_CHANNEL_NAME = "metric_down_stream_collection";
    String METRIC_UP_STREAM_WORKER_TOPIC_NAME = "up_stream_metrics";
    String METRIC_UP_STREAM_WORKER_CHANNEL_NAME = "metric_up_stream_collection";
    String DISCOVERY_WORKER_TOPIC_NAME = "discovery_requests";
    String DISCOVERY_WORKER_CHANNEL_NAME = "network_discovery";
    String JOB_WORKER_TOPIC_NAME = "jobs";
    String JOB_WORKER_CHANNEL_NAME = "job_execution";
    String SCHEDULE_ALERT_TOPIC_NAME = "schedule_alerts";
    String SCHEDULE_ALERT_CHANNEL_NAME = "schedule_alert_analysis";
    String DISCOVERY_CHANNEL = "network_discovery";
    String NOTIFICATION_CHANNEL = "event_notification";
    String STREAM_TOPIC_NAME = "streams";
    String STREAM_CHANNEL_NAME = "stream_analysis";
    String INSTANCE_SYNC_TOPIC_NAME = "sync_requests";
    String INSTANCE_SYNC_CHANNEL_NAME = "dynamic_object_sync";
    String RPE_REQUEST_TOPIC = "rpe_requests";
    String RPE_REQUEST_CHANNEL_NAME = "rpe_request_execution";

    String RPE_MASTER_REQUEST_TOPIC = "rpe_master_requests";
    String RPE_MASTER_REQUEST_CHANNEL_NAME = "rpe_master_request_execution";

    String RPE_RESPONSE_TOPIC = "rpe_responses";
    String RPE_RESPONSE_CHANNEL_NAME = "rpe_response_execution";
    String UI_REQUESTS = "ui_requests";
    String LICENSE_VALIDATOR = "license_requests";
    String LICENSE_VALIDATOR_CHANNEL_NAME = "license_requests_execution";
    String UI_REQUESTS_CHANNEL_NAME = "ui_requests_execution";
    String NCM_WORKER_TOPIC_NAME = "ncm_requests";
    String NCM_WORKER_CHANNEL_NAME = "ncm_collection";
    String NCM_COMPLIANCE_WORKER_TOPIC_NAME = "ncm_compliance_requests";
    String NCM_COMPLIANCE_WORKER_CHANNEL_NAME = "ncm_compliance_execution";
    String NCM_RESULT_COLLECTOR_CHANNEL_NAME = "ncm_result_collector";
    String NCM_DISCOVERY_CHANNEL = "ncm_network_discovery";
    String NCM_DISCOVERY_WORKER_TOPIC_NAME = "ncm_discovery_requests";
    String NCM_STARTUP_CONFIG = "startup_config";
    String BUSINESS_SLA_WORKER_TOPIC_NAME = "sla_requests";
    String BUSINESS_SLA_WORKER_CHANNEL_NAME = "sla_collection";
    String UI_BUSINESS_SLA_REQUESTS = "ui_business_sla_requests";
    String UI_BUSINESS_SLA_REQUESTS_CHANNEL_NAME = "ui_business_sla_requests_execution";
    String UI_ALERT_NOTIFICATION = "ui-alert-notification";
    String BUSINESS_SERVICE_SLA_RESULT = "business_service_sla_request";
    String TROUBLE_TICKET_UI_TOPIC_NAME = "trouble_ticket";
    String MONITOR_POLLING_ISSUE = "monitor_polling_issue";
    String DOWN_MONITOR_INTERFACES_TOPIC_NAME = "down_monitor_interfaces";
    String DOWN_MONITOR_INTERFACE_TOPIC_NAME_CHANNEL = "down_monitor_interfaces_channel";
    String METRIC_GEVENT_DOWN_STREAM_WORKER_TOPIC_NAME = "gevent_down_stream_metrics";
    String TRAP_ANALYZER_PARSER_TOPIC_NAME = "traps";
    String TRAP_ANALYZER_PARSER_CHANNEL_NAME = "trap_analysis";
    String CISCO_EOX_CACHE_SYNC_WORKER_TOPIC_NAME = "cisco_eox_cache_sync_request";
    String CISCO_EOX_CACHE_SYNC_WORKER_CHANNEL_NAME = "cisco_eox_cache_sync_execution";

    String CLUSTER_REQUEST_CHANNEL_NAME = "cluster_request_collection";
    String CLUSTER_REQUEST_TOPIC_NAME = "cluster_request";
    String CLUSTER_INDEX_REQUEST_TOPIC_NAME = "index_" + CLUSTER_REQUEST_TOPIC_NAME;
    String CLUSTER_REQUEST_NOTIFIER_CHANNEL_NAME = "cluster_request_notifier";
    String CLUSTER_INDEX_REQUEST_NOTIFIER_CHANNEL_NAME = "index_" + CLUSTER_REQUEST_NOTIFIER_CHANNEL_NAME;
    String CLUSTER_REQUEST_NOTIFIER_TOPIC_NAME_PREFIX = "cluster_request_notifier";
    String TRAP_CACHE_CLEAR_TOPIC_NAME="trap_cache_clear_topic";
    String TRAP_CACHE_CLEAR_CHANNEL_NAME="trap_cache_clear_channel";
    String TRAP_FORWARDER_TOPIC_NAME = "traps_forwarder";
    String TRAP_FORWARDER_CHANNEL_NAME = "traps_channel";


    short WORK_METRIC_COLLECTION = 1;
    short WORK_MAINTENANCE_METRIC_COLLECTION = 2;
    short WORK_DISABLED_METRIC_COLLECTION = 3;
    short WORK_LOG = 4;
    short WORK_FLOW = 5;
    short WORK_SCHEDULER_ALERT = 6;
    short WORK_JOB = 7;
    short WORK_DISCOVERY = 8;
    short WORK_LOG_COLLECTION = 9;
    short WORK_INSTANCE_DELETE = 10;
    short WORK_INSTANCE_ADD = 11;
    short WORK_REAL_TIME_ALERT = 12;
    short WORK_DISABLE_MONITORS = 13;
    short WORK_ENABLE_MONITORS = 14;
    short WORK_DOWN_STREAM_METRIC_COLLECTION = 15;
    short WORK_ADD_RPE_CLIENT = 16;
    short WORK_REMOVE_RPE_CLIENT = 17;
    short WORK_RPE_ABORT_DISCOVERY = 18;
    short WORK_RPE_DISCOVERY_RESULT = 19;
    short WORK_UPDATE_METRIC_OVERVIEW_DETAILS = 20;
    short WORK_UPDATE_METRIC_CACHE = 21;
    short WORK_UPDATE_DATABASE_QUERIES = 22;
    short WORK_UPDATE_DATA_STRUCTURE = 23;
    short WORK_RPE_HEALTH_STATISTICS = 24;
    short WORK_RPE_SHUTDOWN = 25;
    short WORK_RPE_WORKER_OPERATION = 26;
    short WORK_RPE_DELETE_MONITORS = 27;
    short WORK_DEVICE_SIGNATURE_REPLICA = 28;
    short WORK_STREAMING_OPERATION = 29;
    short WORK_PLUGIN_DETAILS_REPLICATION = 30;
    short WORK_RPE_LOW_DISK_SPACE_NOTIFICATION = 31;
    short WORK_REPORT_JOB_REQUEST = 32;
    short WORK_BACKUP_JOB_REQUEST = 33;
    short WORK_MONITOR_MAINTENANCE_JOB_REQUEST = 34;
    short WORK_NCM_DEVICE_REQUEST_BACKUP = 35;
    short WORK_NCM_DEVICE_REQUEST_RESTORE = 36;
    short WORK_NCM_DEVICE_REQUEST_DISCOVER = 37;
    short WORK_NCM_RPE_DISCOVERY_RESULT = 38;
    short WORK_NCM_RPE_RESULT_COLLECTOR = 39;
    short WORK_NCM_DEVICE_BACKUP_JOB_REQUEST = 40;
    short WORK_RPE_NCM_ABORT_DISCOVERY = 41;
    short WORK_SLA_ALERT_MESSAGE = 42;
    short WORK_SLA_CALCULATION_RESULT = 43;
    short WORK_SLA_ADD_SLA_LIFE_CYCLE_REQUEST = 44;
    short WORK_SLA_LIFE_CYCLE_REQUEST = 45;
    short WORK_SLA_REPORT_JOB_REQUEST = 46;
    short WORK_SLA_RPE_ALERT_CONTEXT = 47;
    short WORK_CONFIGDB_CLUSTER_TYPE = 48;
    short WORK_REPORTDB_CLUSTER_TYPE = 49;
    short WORK_MONITOR_POLLING_ISSUE_REPORT_JOB_REQUEST = 50;
    short WORK_OBSERVER_JOB_REQUEST = 51;
    short WORK_AUTO_NETWORK_DISCOVERY_JOB_REQUEST = 52;
    short WORK_MONITOR_INTERFACE_RESET_JOB_REQUEST = 53;
    short WORK_SLA_INSPECTION_REQUEST = 54;
    short WORK_SLA_NOTIFICATION_REQUEST = 55;
    short WORK_RPE_ALERT_STREAM_CHANGE = 56;
    short WORK_SLA_CALCULATION_REQUEST = 57;
    short WORK_LOG_EXPORT_JOB_REQUEST = 58;
    short WORK_NCM_FILE_NAME_PERSIST_REQUEST = 59;
    short WORK_TROUBLE_TICKET_NOTIFICATION = 60;
    short WORK_NCM_EXECUTE_ACTION = 61;
    short WORK_TROUBLE_TICKET_VIEW_ACTION_REQUEST = 62;
    short WORK_TROUBLE_TICKET_CONTEXT_UPDATE_REQUEST = 63;
    short WORK_MONITOR_REDISCOVER_INTERFACE_REQUEST = 64;
    short WORK_ALERT_CORRELATION_REQUEST = 65;
    short WORK_DOWN_MONITOR_INTERFACES = 66;
    short WORK_NCM_REPORT_EXPORT_JOB_REQUEST = 67;
    short WORK_MONITOR_INVENTORY_JOB_REQUEST = 68;
    short WORK_MONITOR_POLLING_ISSUE_REQUEST = 69;
    short UPDATE_REMEDY_ACTION_WORK_TYPE = 70;
    short WORK_JOB_EXECUTION_START_REQUEST = 72;
    short WORK_JOB_EXECUTION_STOP_REQUEST = 73;
    short WORK_CAHCE_FILE_CLUSTER_TYPE = 74;
    short WORK_UPDATE_MONITOR_METRICS = 75;
    short WORK_REFRESH_DEVICE_CACHE = 76;
    short WORK_MONITOR_MAINTENANCE_UPDATE = 77;
    short WORK_BACKUP_JOB_REQUEST_WITH_CONFIG = 78;
    short WORK_SNMP_TRAP_BACKUP_JOB = 79;
    short WORK_NCM_DEVICE_FIRMWARE_UPGRADE = 80;
    short WORK_LOG_PARSER_RULE_UPDATE = 81;
    short WORK_JMS_CHANNEL = 82;
    short WORK_JMS_ALERT_INSERT_OPERATION = 83;
    short WORK_ALERT_CORRELATION_CSV_FILE_READ_OPERATION = 84;
    short WORK_CORRELATION_WORKER_START_FLAG = 85;
    short WORK_LOG_INDEX_CLUSTER_TYPE = 86;
    short WORK_CORRELATION_AUDIT = 87;
    short WORK_DISK_UTILIZATION_AUDIT = 88;
    short WORK_UNPLANNED_ACTIVITY = 89;
    short WORK_DELETE_UNPLANNED_ACTIVITY = 90;
    short WORKER_SYNC_MONITOR_LAST_SEEN_CACHE_CHANGE_OPERATION = 91;
    short WORKER_SYNC_MONITOR_INIT_LAST_SEEN_CACHE = 92;
    short WORK_SPM_ARP_UPDATE_CONTEXT = 93;
    short WORK_NCM_COMPLIANCE_EXECUTION_CONTEXT = 94;
    short WORK_LDAP_DELETE_USER_EXECUTION_CONTEXT = 95;
    short WORK_COMPLIANCE_AUTO_REMEDIATION_EXECUTION_CONTEXT = 96;
    short WORK_UPGRADE_EXECUTION_CONTEXT = 97;
    short WORK_RPE_TROUBLE_TICKET_CREATE_CONTEXT = 98;
    short WORK_ADD_RPE_DEFAULT_UPGRADE_ENTRY_CONTEXT = 99;
    short WORK_POLL_MONITOR_NOW = 100;
    short UPDATE_LINK_MONITORING_CONTEXT = 101;
    short WORK_CISCO_EOX_CACHE_SYNC_CONTEXT = 102;
    short WORK_MONITOR_NAME_REPLACEMENT = 103;
    short WORK_NCM_RESULT_COLLECTOR = 104;
    short WORK_FIRMWARE_REPOSITORY_SYNC = 105;
    short WORK_AVAILABILITY_COLLECTION = 106;
    short WORK_BULK_METRIC_COLLECTION = 107;
    short WORK_AUDIT_LOG = 108;
    short WORK_WAN_MONITOR_INDEX_CREATE = 109;
    short ALERT_LAST_SEEN_WORK_TYPE = 110;
    short ALERT_NOTIFICATION_COUNT_TYPE_WORK_TYPE = 111;
    short WORK_DAILY_INDEX_QUOTA_CHECK = 112;
    short WORK_WEBHOOK_PUSH = 113;
    short WORK_RPE_UI_ALERT = 114;

    short WORK_MONITOR_MIGRATION = 115;

    short WORK_MIGRATE_INTEGRATION_CACHE = 116;

    short WORK_RPE_DISABLE_MONITORS = 117;
    short WORK_RPE_INCREASING_MESSAGE_QUEUE_NOTIFICATION  = 118;

    // worker type
    short METRIC_COLLECTOR_WORKER = 1;
    short DISCOVERY_WORKER = 2;
    short FLOW_ANALYZER_WORKER = 3;
    short LOG_ANALYZER_WORKER = 4;
    short JOB_WORKER = 5;
    short FLOW_COLLECTOR_WORKER = 6;
    short METRIC_DOWN_STREAM_WORKER = 7;
    short NCM_COLLECTOR_WORKER = 8;
    short BUSINESS_SLA_WORKER = 9;
    short TRAP_ANALYZER_WORKER = 10;
    short ALERT_CORRELATION_WORKER = 11;



    // operation constant and redis subscriber channel names
    String OPERATION_TYPE = "operation-type";
    String OPERATION_CONTEXT = "operation-context";
    String OPERATION_TOPIC_NAME = "config_operations";
    String OPERATION_CHANNEL_NAME = "config_sync";
    String WORKER_OPERATION_CHANNEL_NAME = "config_sync";
    String RPE_MASTER_CHANNEL = "rpe_master";
    String STREAMING_CHANNEL = "streaming_operation";
    String ALERT_STREAM_TOPIC_NAME = "alert_stream_operations";
    String ALERT_STREAM_CHANNEL_NAME = "alert_stream_sync";

    String ALERT_CORRELATION_MAP_TOPIC_NAME = "alert_correlation_map_operations";
    String ALERT_CORRELATION_MAP_CHANNEL_NAME = "alert_correlation_map_sync";

    String EVENT_LOG_LISTENER_CHANNEL_NAME = "event_log_listener_channel";
    String EVENT_LOG_LISTENER_TOPIC_NAME = "event_log_listener_topic";

    String FAULTY_METRIC_COLLECTION_CHANNEL_NAME = "faulty_metrics_collection";
    String FAULTY_METRIC_COLLECTION_TOPIC_NAME = "faulty_metrics";


    String TROUBLE_TICKET_CHANNEL_NAME = "trouble_ticket_sync";

    String TROUBLE_TICKET_UI_CHANNEL_NAME = "trouble_ticket_UI_sync";

    String MONITOR_POLLING_ISSUE_CHANNEL_NAME = "monitor_polling_issue_report";

    String TROUBLE_TICKET_ALERT_MAP = "trouble-ticket-map";

    String TROUBLE_TICKET_ALERT_CUSTOM_MAP = "trouble-ticket-custom-map";

    String TROUBLE_TICKET_MAP = "trouble-ticket";

    String CUSTOM_TROUBLE_TICKET_MAP = "custom-trouble-ticket";

    String MONITOR_ALERT_CORRELATION_CACHE = "monitor-alert-correlation-cache";

    String TROUBLE_TICKET_CREATE_CHANNEL_NAME = "trouble_ticket_create_channel";

    String TROUBLE_TICKET_REQUEST_ID = "trouble_ticket_request_id";

    String SERVICEOPS_TROUBLE_TICKET_ACTION = "serviceops-trouble-ticket-action";

    String TROUBLE_TICKET_CREATE_TOPIC_NAME = "trouble_ticket_create";

    String TROUBLE_TICKET_RQUEST_ID_MAP = "trouble-ticket-requestId-cache";

    String TROUBLE_TICKET_RQUEST_ID_PENDING_MAP = "trouble-ticket-requestId-pending-cache";

    String SERVICEOPS_ASYNC_API_FLAG = "serviceops-async-api";

    String OPERATION_TYPE_WITH_UNDERSCORE = "operation_type";

    String WORK_TYPE_WITH_UNDERSCORE = "work_type";

    String ALERT_KEY_WITH_UNDERSCORE = "alert_key";

    String ALERT_VALUE_WITH_UNDERSCORE = "alert_value";

    short OPERATION_CUSTOM_JOB_CHANGE = 1;
    short OPERATION_EVENT_ALERT_CHANGE = 2;
    short OPERATION_ADD_ACTION_SUPPRESSION = 3;
    short OPERATION_REMOVE_ACTION_SUPPRESSION = 4;
    short OPERATION_EXECUTE_JOB = 5;
    short OPERATION_ADD_LOG_COLLECTOR = 6;
    short OPERATION_DELETE_LOG_COLLECTOR = 7;
    short OPERATION_ADD_STREAM_LISTENER_SOURCE = 8;
    short OPERATION_DELETE_STREAM_LISTENER_SOURCE = 9;
    short OPERATION_FULL_TEXT_SEARCH_NODE_REQUEST = 10;
    short OPERATION_LOG_LEVEL_REQUEST = 11;
    short OPERATION_MONITOR_ALERT_CHANGE = 12;
    short OPERATION_ADD_ALERT_SUPPRESSION = 13;
    short OPERATION_REMOVE_ALERT_SUPPRESSION = 14;
    short OPERATION_ADD_EMAIL_CIRCUIT_BREAKER_JOB = 15;
    short OPERATION_CHANGE_TRAP_CONFIGURATION = 16;
    short OPERATION_TRAP_ALERT_CHANGE = 17;
    short OPERATION_LDAP_SYNC_STATUS_CHANGE = 18;
    short OPERATION_TOPOLOGY_CHANGE_CONFIGURATION = 19;
    short OPERATION_EXECUTE_LICENSE_JOB = 21;
    short OPERATION_UPDATE_LOG_STATISTICS = 22;


    short WORKER_CONFIGURATION_CHANGE = 1;
    short WORKER_LOG_LEVEL_CHANGE = 2;
    short WORKER_EVENT_ALERT_CONTEXT_CHANGE = 3;
    short WORKER_MONITOR_ALERT_CONTEXT_CHANGE = 4;
    short WORKER_RESET_CLEAR_SEVERITY_QUEUE = 5;
    short WORKER_FULL_TEXT_SEARCH_OPERATION = 6;
    short WORKER_SHUTDOWN_OPERATION = 7;
    short WORKER_STOP_STATISTICS_OPERATION = 8;
    short WORKER_DELETE_CORRELATED_MONITORS = 9;
    short WORKER_RESTART_OPERATION = 10;
    short WORKER_RPE_OPERATION = 11;
    short WORKER_RELOAD_METRIC_PLUGIN_DETAILS = 12;
    short WORKER_SPHINX_INDEX_OPERATION = 13;
    short WORKER_BUSINESS_SLA_CONFIGURATION_CHANGE = 14;
    short WORKER_RELOAD_LOG_PARSER_PLUGIN_DETAILS = 16;
    short WORKER_TRAP_CONFIGURATION_CHANGE_OPERATION = 17;
    short WORKER_DELETE_MONITOR_LAST_SEEN_CACHE_CHANGE_OPERATION = 18;
    short WORKER_DELETE_ALERT_LAST_SEEN_CACHE_CHANGE_OPERATION = 19;
    short WORKER_TOPOLOGY_CONFIGURATION_CHANGE_OPERATION = 20;
    short WORKER_POLLING_MONITOR_EMAIL = 21;
    short WORKER_RESET_LOG_STATISTICS_COUNTERS = 22;



    short STREAM_WORK_PING_DETAILS = 1;
    short STREAM_WORK_PING_RESULT = 6;


    //streaming constants
    short STREAM_WORK_NCM_AUDIT_LOG = 4;
    short STREAM_WORK_TEST_CREDENTIALS_DETAILS = 3;
    short STREAM_WORK_TRACE_ROUTE_DETAILS = 2;
    short STATUS_CODE_REACHABLE = 1;
    short STREAM_WORK_MONITOR_REDISCOVER_INTERFACE = 5;


    // global discovery status constants
    short STATUS_CODE_UNREACHABLE = 4;
    short STATUS_CODE_MAINTENANCE = 3;
    short STATUS_CODE_UNKNOWN = 0;
    short STATUS_CODE_DISABLED = 2;

    String STATUS = "status";
    String STATUS_CODE = "Status";
    String UPTIME = "downtime";
    String STATUS_VALUE = "status-value";
    String ERROR_CODE = "error-code";
    String ERROR_PING_FAILED = "Ping Failed [%s]";
    String ERROR_SERVICE_DOWN = "Port [%s] not available on [%s]";
    String ERROR_AUTH = "Invalid Credentials [%s]";
    String ERROR_EXCEPTION = "error-exception";
    String ERROR_ALREADY_DISCOVERED = "Host already discovered with other profile";
    String RESULT = "result";
    String NULL = "null";
    String COMMA = ",";

    // alert constants
    short ALERT_FILTER_TYPE_DEPARTMENT = 1;
    short ALERT_FILTER_TYPE_MONITOR = 2;
    short ALERT_FILTER_TYPE_RPE = 3;
    short ALERT_FILTER_TYPE_TAG = 4;
    short ALERT_FILTER_TYPE_SOURCE_HOST = 5;
    short ALERT_FILTER_TYPE_ALERT = 6;
    short ALERT_FILTER_TYPE_MONITOR_LINK_TAGS = 7;
    short ALERT_CONTEXT_ID = 1;
    short ALERT_CONTEXT_MESSAGE = 2;
    short ALERT_TYPE_SCHEDULED = 1;
    short ALERT_TYPE_REAL_TIME = 2;
    short ALERT_CONDITION_EVERY_RESULT = 1;
    short ALERT_CONDITION_NUMBER_OF_RESULT = 2;
    short ALERT_CONDITION_CUSTOM = 3;
    short ALERT_TRIGGER_TIME_FORMAT_SECONDS = 1;
    short ALERT_TRIGGER_TIME_FORMAT_MINUTES = 2;
    short ALERT_TRIGGER_TIME_FORMAT_HOURS = 3;
    short ALERT_TRIGGER_TIME_FORMAT_DAYS = 4;
    short ALERT_TRIGGER_TIME_FORMAT_MONTHS = 5;
    short ALERT_TRIGGER_TIME_FORMAT_YEARS = 6;
    short ALERT_SCHEDULE_TIME_HOURLY = 1;
    short ALERT_SCHEDULE_TIME_DAILY = 2;
    short ALERT_SCHEDULE_TIME_WEEKLY = 3;
    short ALERT_SCHEDULE_TIME_MONTHLY = 4;
    short ALERT_SCHEDULE_TIME_ONE_TIME = 5;
    short ALERT_SCHEDULE_TIME_CRON = 6;
    short PLUGIN_LEVEL_NETWORK_DEVICE = 0;
    short PLUGIN_LEVEL_HYPER_VISOR = 1;
    short PLUGIN_LEVEL_HYPER_VISOR_VM = 2;
    short PLUGIN_LEVEL_SERVER = 3;
    short PLUGIN_LEVEL_APPLICATION = 4;
    String IPV4_REGEX_PATTERN = "(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
    String MAC_ADDRESS_REGEX_PATTERN = "^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$";
    short NOT_AVAILABLE = -1;
    short LOG_LEVEL_TRACE = 0;
    short LOG_LEVEL_DEBUG = 1;

    //health constant

    short HEALTH_FILTER_TYPE_DEPARTMENT = 1;

    short HEALTH_FILTER_TYPE_MONITOR = 2;

    short HEALTH_FILTER_TYPE_RPE = 3;

    short HEALTH_FILTER_TYPE_TAG = 4;

    short HEALTH_FILTER_TYPE_SOURCE_HOST = 6;

    String MOTADATA_SYSTEM_SSH_KEY_FILE_NAME = "motadata-master-system-ssh-key";

    // log level constants
    short LOG_LEVEL_INFO = 2;
    short LOG_LEVEL_WARNING = 3;
    short LOG_LEVEL_ERROR = 4;
    String DATA_MODEL_TYPE = "data-model-type";
    String DATA_MODEL_METRICS = "data-model-metrics";

    // data models constant
    String DATA_MODEL_SOURCE_TYPES = "data-model-source-types";
    int JMX_JETTY_PORT = 35000;
    int JMX_LOG_PORT = 35001;
    int JMX_FLOW_PORT = 35002;
    int JMX_COLLECTOR_PORT = 35003;
    int JMX_KERNEL_PORT = 35004;
    int JMX_JOB_PORT = 35005;
    int JMX_DISCOVERY_PORT = 35006;
    int JMX_RPE_MASTER_PORT = 35007;
    int JMX_RPE_CLIENT_PORT = 35008;
    int JMX_NCM_COLLECTOR_PORT = 35009;
    int JMX_BUSINESS_SLA_PORT = 35010;
    int JMX_TRAP_ANALYZER_PORT = 35012;
    int JMX_ALERT_CORRELATION_PORT = 35015;

    short DATA_MODEL_TYPE_DEFAULT = -1;
    short DATA_MODEL_TYPE_COMPOSITE = 0;

    /* data model type copnstants */
    short DATA_MODEL_TYPE_INSTANCE = 1;
    short MAX_RECORD_LIMIT = 10000;
    int UNLIMITED_MAX_RECORD_LIMIT = 100000;
    String RPE_DISCONNECT_MESSAGE = "RPE @@@ disconnected since ###";
    String RPE_RECONNECT_MESSAGE = "RPE @@@ reconnected after ###";
    String PLUGIN_CATEGORY_FLOW = "Flow";
    String PLUGIN_CATEGORY_LOG = "Log";

    //plugin Category
    String CREDENTIAL_CONTEXT = "credential-context";
    String DISCOVERY_PARAM_CONTEXT = "discovery-param-context";

    //plugin relationship
    String PARENT_PLUGIN = "parent-plugin";
    String CHILDREN_PLUGINS = "children-plugins";

    //lucene index

    String LUCENE_INDEX_DIRECTORY = "indices";

    String THREE_DECIMAL_FORMAT = "#.###";

    String TWO_DECIMAL_FORMAT = "#.##";

    //flow

//    DateTimeFormatter FLOW_TIME_FORMAT_V5 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.S");

//    DateTimeFormatter FLOW_TIME_FORMAT_V9 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.SSSSSS");

    short INGRESS_FLOW = 1;

    short EGRESS_FLOW = 2;

    String FLOW_TYPE = "flow_type";

    String FLOW_VERSION = "export_proto_version";


    //bsm/sla constants
    short BUSINESS_SERVICE_TYPE_MONITOR = 0;

    short BUSINESS_SERVICE_TYPE_BUSINESS_SERVICE = 1;


    // HA Constants
    String QUERIES = "queries";

    String BATCH_QUERIES = "batch_queries";

    String CACHE_FILE_TYPE = "cache_file_type";

    String CACHE_OPERATION_TYPE = "cache_operation_type";

    String CACHE_FILE_NAME = "cache_file_name";

    String ALERT_CORRELATION_CSV_FILE = "alert-correlation";

    String TEMP_DIR = "tmp";

    String CACHE = "cache";

    String NSQ_DIRECTORY = "nsq";

    String BIN_DIRECTORY = "bin";

    short ALERT_CACHE_FILE = 0;

    short TROUBLE_TICKET_CACHE_FILE = 1;

    short PLUGIN_CACHE_FILE = 2;

    short TOPOLOGY_CACHE_FILE = 3;

    short MONITOR_ALERT_CORRELATION_CACHE_FILE = 4;

    //motadata components names
    String[] MOTADATA_COMPONENTS = {
            "motadata-datastore-client", //0
            "motadata-httputil", //1
            "motadata-jmxutil", //2
            "motadata-messaging-client", //3
            "motadata-networkutil", //4
            "motadata-python-engine", //5
            "motadata-query-builder", //6
            "motadata-redis-client", //7
            "motadata-sdk", //8
            "motadata-lucene-search-client", //9
            "motadata-sshutil", //10
            "motadata-kernel", //11
            "motadata-metric-collector", //12
            "motadata-down-stream", //13
            "motadata-discovery", //14
            "motadata-flow-analyzer", //15
            "motadata-flow-collector", //16
            "motadata-log-analyzer", //17
            "motadata-job", //18
            "motadata-rpe-master", //19
            "motadata-rpe-client", //20
            "motadata-app-manager", //21
            "motadata-ncm-collector", //22
            "motadata-sla",//23
            "motadata-snmputil" //24
    };
    int VERSION3_SECURITY_LEVEL_AUTH_PRIV = 3;
    int VERSION3_SECURITY_LEVEL_AUTH_NOPRIV = 2;
    int VERSION3_SECURITY_LEVEL_NOAUTH_NOPRIV = 1;

    short BACKUP_FILE_CANDIDATE_CONFIG = 1; // running config

    short BACKUP_FILE_RUNNING_CONFIG = 2; // startup config

    short VLAN_DAT_FILE = 3; // vlan.dat

    String NCM_SERVER_DIR = "ncm-configuration-files";

    String FIRMWARE_IMAGES = "firmware-images";

    String DEVICE_CONFIGURATION_DIR = "device-conf";
    short SEVERITY_UNREACHABLE = 9;
    short SEVERITY_CRITICAL = 8;


    //TODO need to retrieve from config
    short SEVERITY_MAJOR = 7;
    short SEVERITY_WARNING = 6;
    short SEVERITY_CLEAR = 4;
    short SEVERITY_NONE = 1;
    short SEVERITY_DEBUG = 2;
    short SEVERITY_INFO = 3;
    short SEVERITY_MAINTENANCE = 5;
    short SEVERITY_EMERGENCY = 10;

    short TOP_CONDITION = 1;
    short LEAST_CONDITION = 2;

    //SLA Constants
    short BUSINESS_SLA_TYPE_DAILY = 1;
    short BUSINESS_SLA_TYPE_WEEKLY = 2;
    short BUSINESS_SLA_TYPE_MONTHLY = 3;
    short BUSINESS_SLA_TYPE_QUARTERLY = 4;

    String BUSINESS_SLA_ID = "sla_id";
    short BUSINESS_SLA_STATUS_UNKNOWN = 1;
    short BUSINESS_SLA_STATUS_CLEAR = 2;
    short BUSINESS_SLA_STATUS_CRITICAL = 3;
    short BUSINESS_SLA_STATUS_WARNING = 4;
    String BUSINESS_SLA_DATA_MODEL_NAME = "tbl_sla_alert";


    //interface availability constant
    short STATUS_CODE_INTERFACE_UP = 1;
    short STATUS_CODE_INTERFACE_DOWN = 2;
    short STATUS_CODE_INTERFACE_TESTING = 3;
    short STATUS_CODE_INTERFACE_UNKNOWN = 4;
    short STATUS_CODE_INTERFACE_DORMANT = 5;
    short STATUS_CODE_INTERFACE_NOT_PRESENT = 6;

    enum PluginType
    {
        LogParser,

        LogCollector,

        Action,

        FlowParser,

        MetricCollector,

        Job,

        OutputWriter,

        StreamListener,

        NCMCollector,

        TrapParser
        }

    enum AlertCondition
    {
        Equal,

        NotEqual,

        GreaterThan,

        GreaterThanEqual,

        LessThan,

        LessThanEqual,

        Contains,

        NotContains,

        StartWith,

        EndWith,

        In,

        NotIn
    }

    enum InstallationType
    {
        Standalone,
        Master,
        Client
    }

    enum RedisFunction
    {
        UpdateMapContext,
        UpdateNumericHashContext,
        UpdateFieldContext,
        UpdateContext,
        DeleteContext,
        UpdateHashContext

    }

    enum Version
    {
        v1, v2c, v3
    }

    String TRAP_PLUGIN_ID = "trap-engine-log-parser";

    int FIRST_QUARTER = 1;
    int SECOND_QUARTER = 2;
    int THIRD_QUARTER = 3;
    int FOURTH_QUARTER = 4;

    int FIRST_QUARTER_START_MONTH = 1;
    int SECOND_QUARTER_START_MONTH = 4;
    int THIRD_QUARTER_START_MONTH = 7;
    int FOURTH_QUARTER_START_MONTH = 10;

    int FIRST_QUARTER_END_MONTH = 3;
    int SECOND_QUARTER_END_MONTH = 6;
    int THIRD_QUARTER_END_MONTH = 9;
    int FOURTH_QUARTER_END_MONTH = 12;

    short BUSINESS_SERVICE_SEVERITY_NONE = 0;

    short BUSINESS_SERVICE_SEVERITY_CLEAR = 1;

    short BUSINESS_SERVICE_SEVERITY_CRITICAL = 2;

    String ALERT_CACHE_FILES_DIR = "alert-cache-files";

    String INTERFACE_OPERATIONAL_STATUS = "Interface Operational Status";

    String INTERFACE_OPERATIONAL_STATUS_UP = "Up";

    String INTERFACE_OPERATIONAL_STATUS_DOWN ="Down";

    String CACHE_CRITICAL_MONITORS = "critical-monitors";

    String CACHE_WARNING_MONITORS = "warning-monitors";

    String CACHE_MAJOR_MONITORS = "major-monitors";

    String CACHE_UNREACHABLE_MONITORS = "unreachable-monitors";

    String CACHE_NONE_MONITORS = "none-monitors";

    String CACHE_CLEAR_MONITORS = "clear-monitors";

    String TROUBLE_TICKET_CACHE_CHANNEL = "trouble-ticket-cache-channel";

    String CACHE_INTERFACE_DOWN_ALERT_KEYS = "interface-down-alert-keys";

    String CACHE_INTERFACE_UP_ALERT_KEYS = "interface-up-alert-keys";

    String CACHE_CRITICAL_ALERT_KEYS = "critical-alert-keys";

    String CACHE_NONE_ALERT_KEYS = "none-alert-keys";

    String CACHE_WARNING_ALERT_KEYS = "warning-alert-keys";

    String CACHE_MAJOR_ALERT_KEYS = "major-alert-keys";

    String CACHE_UNREACHABLE_ALERT_KEYS = "unreachable-alert-keys";

    String CACHE_CLEAR_ALERT_KEYS = "clear-alert-keys";

    String CACHE_MONITOR_ALERT_KEYS = "monitor-alert-keys";

    String CACHE_MONITOR_ALERTS_CACHE = "monitor-alerts-cache";

    String CACHE_ALERT_LAST_SEEN_MAP = "alert-last-seen-map";

    String ALERT_CACHE_CHANNEL = "alert-cache-channel";

    String ALERT_CORRELATION_CHANNEL = "alert-correlation-channel";

    String CACHE_ALERTS_CORRELATION_CACHE = "alert-correlated-monitor-map";

    String AVAILABILITY_MONITORS_CACHE = "availability-monitor-map";

    String CACHE_ALERTS_CORRELATION_CHILD_CACHE = "alert-correlated-child-monitor-map";

    String ALERT_CORRELATION_INTERFACE = "motadata_default_interface";

    String ALERT_CORRELATION_PARENT_MAP = "alert-correlated-monitor";

    String ALERT_CORRELATION_CHILD_MAP = "alert-correlated-child-monitor";


    //Trouble Ticket Constant

    short CREATE_TICKET = 0;

    short UPDATE_TICKET = 1;

    short CLOSE_TICKET = 2;

    short REQUEST_NONE = 4;

    short UPDATE_CUSTOM_TICKET = 5;

    short CLOSE_CUSTOM_TICKET = 6;

    String WORKER_TYPE = "worker-type";

    String ALERT_TICKET_KEY = "alert-ticket-key";

    String PLUGIN_ACTION_ID = "plugin-action-id";

    String TICKET_TYPE = "ticket-type";

    int RESPONSE_SUCCESS = 200;

    int RESPONSE_ACCESS_TOKEN_FAIL = 401;

    int ERROR_INCIDENT_NOT_EXISTS = 500;

    // NCM Constants

    short NCM_BACKUP_ACTION_ID = -1;

    short NCM_RESTORE_ACTION_ID = -2;

    short NCM_UNKNOWN_ID = 0;

    short DEFAULT_RPE = 0;

    String DEFAULT_INTERFACE_NAME = "-1";

    // notification action log

    String EMAIL_NOTIFICATION = "Email";

    String SMS_NOTIFICATION = "SMS";

    String PYTHON_POLLING = "python-polling";

    String METRIC_GROUP = "metric-group";

    String  RPE_REDIS_SUBSCRIBER = "rpe-redis-subscriber";

    // trap uuid
    String TRAP_UUID = "trup-uuid";

    String TRAP_PDU = "trap-pdu";

    String TRUE_VALUE = "1";

    String FALSE_VALUE = "0";

    // device hierarchy
    String PARENT_MONITOR_ID = "parent_monitor_id";

    String EVENT_FAILURE_TIME = "event_failure_time";

    String KEY = "key";

    String VALUE = "value";

    String PARENT_NODE_UNAVAILABLE = "Parent Node Unavailable";

    static final String DATA_MODEL_BUSINESS_SERVICE_FAILED_ALERT = "Business Service Failed Alert";

    static final String VALUE_SEPARATOR_DR = "_|m@@@!!@@@a|_";

    static final String LINE_SEPARATOR_DR = "_|m@@##!!##@@a|_";

    static final String NEW_LINE_DR = "_|m@##@a|_";

    static final short INET_ADDRESS_TYPE_6 = 4;

    static final short INET_ADDRESS_TYPE_4 = 0;

    static final String HTML_TEMPLATE_SUPOORTING_VERSION = "html-template-supporting-version";

    static final String EMAIL_NEW_HTML_TEMPLATE = "email_new_html_template";

    static final String EMAIL_OLD_HTML_TEMPLATE = "email_old_html_template";

    static final short SFTP_CHANNEL = 2;

    static final short FTP_CHANNEL = 1;

    static final String FILE_PREFIX = "compressed_bkp_";

    static final int BACKUPS_TO_STORE = 2;

//    static final DateTimeFormatter DR_BACKUP_DATE_FORMAT = DateTimeFormat.forPattern("MMM_dd_yyyy_hh:mm:ss_aaa");

    short POLICY_CONFIG_TYPE_ANY = 4;

    short RULE_CONDITION_CONTAINS = 2;

    short RULE_CONDITION_NOT_CONTAINS = 3;

    short RULE_VIOLATED = 1;

    short RULE_NOT_VIOLATED = 0;

    String COMPLIANCE_RULE_SEPARATOR_PREFIX = "@@@";

    String COMPLIANCE_RULE_SEPARATOR_SUFFIX = "###";

    String LOCAL_HOST = "localhost";

    short STANDALONE_SERVER = 0;

    short CLUSTER_MASTER_SERVER = 1;

    short CLUSTER_CLIENT_SERVER = 2;

    String TABLE_MOTADATA_UPGRADE_AUDIT = "tbl_motadata_upgrade_audit";

    String TABLE_MOTADATA_UPGRADE_STATUS = "tbl_motadata_upgrade_status";

    String TABLE_MOTADATA_UPGRADE_HISTORY = "tbl_motadata_upgrade_history";

    String TABLE_MOTADATA_RPE_STANDBY_UPGRADE_STATUS = "tbl_motadata_rpe_standby_upgrade_status";

    String TABLE_MONITOR_MIGRATION = "tbl_monitor_migration";

    String MOTADATA_CURRENT_DIRECTORY = "/motadata/motadata";

    String FETCH_OR_UPLOAD_FILES = "fetch-or-upload-files.py";

    String MOTADATA_DIR = "motadata";

    String MOTADATA_UPGRADE_ZIP = "Motadata-Upgrade.zip";

    String MOTADATA_UPGRADE_PATCH_ZIP = "Motadata-Upgrade-Patch.zip";

    String UPGRADE_DIRECTORY = "upgrade";

    String UPGRADE_ZIP_FILE = "upgrade.zip";

    String MOTADATA_POST_UPGRADE_TAR = "Motadata-postupgrade.tar.gz";

    String MOTADATA_MASTER_DIRECTORY = "Master";

    String MOTADATA_RPE_DIRECTORY = "RPE";

    String MOTADATA_MASTER_UPGRADE_DIRECTORY = "Motadata-master-upgrade";

    String MOTADATA_RPE_UPGRADE_DIRECTORY = "Motadata-rpe-upgrade";

    String MOTADATA_UPGRADE_EXE = "upgrade-installer";

    String LDAP_KEY_STORE_FILE_NAME = "motadata.jks";

    String  CERTIFICATE_ALIAS = "secureldap";

    String JKS_PASSWORD = "motadata";

    short SECURE_PROTOCOL = 1;

    short STATUS_FAILED = 0;

    short STATUS_DONE = 1;

    short RPE_OR_SLAVE_STATUS_FAILED = 2;

    short STATUS_COMPLETED = 3;

    short STATUS_STARTING = 2;

    short STATUS_RUNNING = 3;

    short STATUS_PENDING = 4;

    String PREREQUISITES_VALIDATION = "Prerequisites Validation";

    String PYTHON_PACKAGES = "Python Packages";

    String SERVER_UPGRADE = "Motadata Server Upgrade";

    String UPGRADE_MANAGEMENT_CONF = "upgrade-management-conf.yml";

    String QUERY_CONTEXT_FILE = "query-context.json";

    String QUEUE_QUERY_CONTEXT_FILE = "queue-query-context.json";

    String H2_DIRECTORY =  "h2";

    short OPERATION_TYPE_INSERT = 1;

    short OPERATION_TYPE_UPDATE = 2;

    short OPERATION_TYPE_DELETE = 3;

    String UPGRADE_QUERY_VALUES = "query-values";

    String UPGRADE_QUERY_COLUMNS = "query-columns";

    String UPGRADE_QUERY_TABLE_NAME = "table-name";

    String UPGRADE_QUERY_OPERATION_TYPE = "operation-type";

    String UPGRADE_QUERY_CONDITION = "query-condition";

    String UPGRADE_PROCESS_RUNNING = "3";

    String UPGRADE_PROCESS_DONE = "1";

    String UPGRADE_PROCESS_FAILED = "0";

    String UPGRADE_COMPLETED = "0";

    String UPGRADE_STARTED = "1";

    //Disk space limit is 5 GB.
    long DISK_SPACE_LIMIT = 5000L;

    int SSH_TIME_OUT = 20;

    String PYTHON_UTILITY_DOWNLOAD_LOGS = "download-logs";

    String PYTHON_UTILITY_DOWNLOAD_PLUGINS = "download-plugins";

    String PYTHON_UTILITY_UPLOAD_ZIP_FILE = "upload-zip-file";

    String PYTHON_UTILITY_DOWNLOAD_FILES = "download-files";

    String PYTHON_UTILITY_UPLOAD_SINGLE_FILES = "upload-single-file";

    String PYTHON_UTILITY_UPLOAD_FILES = "upload-files";

    String RPE_CONFIG = "rpe-conf.yml";

    String DNS_SWITCH_OVER = "dns-switch-over";

    String ENABLE = "enable";

    String DISABLE = "disable";

    String RPE_CURRENT_HOSTS = "rpe-current-hosts";

    String RPE_TARGET_HOSTS = "rpe-target-hosts";

    String REPORT_DB_HOST = "report-db-host";

    String BACKUP_FILE_EXTENSION = ".tar.gz";

    short FULL_BACKUP = 0;

    short DIFFERENTIAL_BACKUP = 1;

    String LOG_TCP_SSL_CERT = "ssl-tcp.crt";

    String LOG_TCP_SSL_KEY = "ssl-tcp.key";

    //worker shutdown wait time as 10 second
    int MAX_WORKER_SHUTDOWN_WAIT_TIME = 10000;

    short LINK_STATUS_UP = 6;

    String LINK_UP_STATUS = "Up";

    String LINK_DOWN_STATUS = "Down";

    String DISCOVERY_PROPERTIES = "discovery-properties";

    String BGP_LINK_MONITORING = "bgp-link-monitoring";

    String END_OF_LIFE_DATE = "End Of Life Date";

    String END_OF_SALE_DATE = "End Of Sale Date";

    String END_OF_SUPPORT_DATE = "End Of Support Date";

    String PRODUCT_ID = "Product ID";

    Integer AZURE_PLUGIN_LEVEL = 11;

    Integer AMAZON_PLUGIN_LEVEL = 12;

    String AZURE_PLUGIN_NAME = "MS Azure";

    Integer WAN_PLUGIN_LEVEL = 13;

    String WAN_PLUGIN_NAME = "WAN Monitoring";

    String AMAZON_PLUGIN_NAME = "Amazon";

    String SCRIPT_DIR = "Ncm-Action-Script";

    String SCRIPT_VARIABLE_DISTINCTION ="#";

    short NCM_SCRIPT_ACTION_TYPE = 2;

    String EVENT_TYPE = "event-type";

    String AVAILABILITY_POLL = "availability-poll";

    String AVAILABILITY_POLL_BY_SNMP = "availability-snmp-poll";

    String SYSTEM_PASSWORD = "system_password";

    String EVENT_TYPE_DISCOVER = "discover";

    String EVENT_TYPE_COLLECT = "collect";

    String PLUGIN_GO_POLLING = "go-polling";

    String PLUGIN_LEVEL_GO_POLLING = "plugin-level-go-polling";

    String PING_METRICS_GROUP = "Ping Metrics";

    String BULK_AVAILABILITY_POLL = "bulk-availability-poll";

    String BULK_METRICS_POLL = "bulk-metrics-poll";

    String BULK_DISCOVERY = "bulk-discovery";

    String POLL_CONTEXT = "pollContext";

    String AVAILABILITY_RESULT = "availability-result";

    String MONITOR_HOST = "host";

    String POLLING_ENGINE = "polling-engine";

    String PLUGIN_CONTEXTS_DIR = "plugin-contexts";

    String FAULTY_DEVICE = "faulty-device";

    // Audit constant

    String AUDIT_MESSAGE = "audit-message";

    String AUDIT_STATUS = "audit-status";

    String AUDIT_OPERATION_TYPE = "audit-operation-type";

    // Webhook Constant

    String WEBHOOK_OPERATION_TYPE = "Webhook Action";

    String HTTPS_TLS_VERSION = "TLSv1.3";

    String VULNERABLE_HTTPS_TLS_VERSION = "TLSv1.2";

    String NSQ_TLS_VERSION = "tls1.2";

    String SSH_USER_NAME = "motadata";

    public static final String MONITOR_PORT = "port";

    public static final String MONITOR_ID_KEY = "monitor-id";

    public static final short PLUGIN_LEVEL_WAN_MONITORING = 13;

    public static final String WAN_MONITOR_INDEX = "wan-monitor-index";

    public static final String WAN_MONITOR_TYPE = "wan-monitor-type";

    public static final String TABLE_WAN_MONITOR_INDEX = "tbl_wan_monitor_index";

    public static final String IP_SLA_ICMP_ECHO = "IP SLA ICMP Echo";

    public static final String AVAILABILITY_TEST_OID = "availability-test-oid";

    public static final String AVAILABILITY_TEST_OID_VALUE = "availability-test-oid-value";

    public static final String AVAILABILITY_TEST_IGNORE = "availability-test-ignore";

    public static final short DEFAULT_VALUE_ZERO = 0;

    short ALERT_FILTER_TYPE_SOURCE_TYPE = 8;

    String ALERT_LAST_SEEN_REQUEST_TYPE = "alert-last-seen-request-type";

    String ALERT_NOTIFICATION_COUNT_REQUEST_TYPE = "alert-notification-count-request-type";

    String ALERT_LAST_SEEN_WORK_CONTEXT = "alert-last-seen-cache-context";

    String ALERT_NOTIFICATION_COUNT_WORK_CONTEXT = "alert-notification-count-cache-context";

    String ALERT_LAST_SEEN_FILE = "alert-last-seen";

    String IS_ALERT_LAST_SEEN_CACHE_MIGRATED = "is_alert_last_seen_migrated";

    String ALERT_LAST_SEEN_CACHE_TOPIC_NAME = "alert_last_seen_cache";

    String ALERT_LAST_SEEN_CACHE_CHANNEL_NAME = "alert_last_seen_cache_channel";

    String SNMP_AUTHENTICATION_PROTOCOL = "SHA224:SHA224,SHA256:SHA256,SHA384:SHA384,SHA512:SHA512";

    String TABLE_MONITOR_CUSTOM_FIELD = "tbl_monitor_custom_field";

    String MONITOR_CUSTOM_FIELDS = "monitor-custom-fields";

    public static final String PLUGIN_TYPE_SNMP_METRIC_COLLECTOR = "snmp-metric-collector";

    public static final String DISCOVERY_PLUGIN_TYPE = "discovery-plugin-type";

    public static final String SYSTEM_USER = "system_user";

    short PING_LATENCY_TIMEOUT = 2000;

    short COMMAND_OUTPUT_RETRY_COUNT = 5;

    int DEFAULT_SSH_TIMEOUT = 180; // in seconds

    short DEFAULT_PING_REQUEST = 4;

    public static final String JUNIPER_RPM_RTT = "RTT (MS)";

    public static final String JUNIPER_POSITIVE_JITTER = "Positive Jitter (MS)";

    public static final String JUNIPER_NEGATIVE_JITTER = "Negative Jitter (MS)";

    public static final String JUNIPER_OID_PARENT = "Juniper_OID_Parent";

    String AVAILABILITY_TEST_CONDITION = "availability-test-condition";

    String AVAILABILITY_TEST_CONDITION_NOT_EQUALS = "not-equal";

    public static String SSH_COMMAND_ERROR_STREAM = "SSH Command Error Stream:";

    String LINK_STATUS = "link-status";

    String REDISCOVER_INTERFACE = "rediscover-interface";

    public static final String DONE_BY = "done-by";

    public static final String AUDIT_CONTEXT = "audit-context";

    public static final String REMOTE_HOST = "remote-host";

    String ACCESS_TOKEN = "access_token";

    String TOKEN_TYPE = "token_type";

    String URL = "url";

    String AUTHENTICATION_ENDPOINT = "auth_endpoint";

    String PUSH_DATA_ENDPOINT = "push_data_endpoint";

    String AUTH_USERNAME= "auth_username";

    String AUTH_PASSWORD= "auth_password";

    String SERVICE_OPS_AUDIT_TYPE = "Service Ops Trouble Ticket Action";

    short DEFAULT_ADMIN_USER = 0;

    String AUDIT_SUCCESS = "Success";

    String AUDIT_FAILED = "Failed";

    String CACHE_CONTEXT = "cache-context";

    String SERVICE_OPS_TICKETS_TOPIC_NAME = "service_ops_tickets_queue";

    String SERVICE_OPS_TICKETS_CHANNEL_NAME = "service_ops_tickets_consume";

    String SERVICE_OPS_URL = "serviceopsURL";

    String IS_SERVICE_OPS_RESPONSE_FAILED = "isResponseFailed";

    String SERVICE_OPS_PENDING_REQUESTS = "circuitBreakRequests";

    int SERVICE_OPS_CIRCUIT_BREAK_COUNT = 3;

    short TROUBLE_TICKET_STATUS_UPDATE_REQUEST = 114;

    String SERVICE_OPS_TROUBLE_TICKET_ACTION_STATUS = "serviceops-trouble-ticket-action-status";

    String SERVICE_OPS_CACHE_FILE_DIRECTORY = "service-ops-request-cache";

    String  SERVICE_OPS_CIRCUIT_BREAK = "circuit-break";

    int RESPONSE_BAD_REQUEST = 404;

    public static final String MAIL_SUBJECT = "mail-subject";

    int DEFAULT_VALUE_DISK_QUEUE = 0;

    int MAX_DISK_QUEUE_COUNTER = 3;

    String FPING_ENABLED = "fping-enabled";

    String BULK_PING_ENABLED = "bulkping-enabled";

    String UI_NOTIFICATION_MESSAGE = "ui-notification-message";

    String MAIL_NOTIFICATION_MESSAGE = "mail-notification-message";

    String UI_NOTIFICATION_AUDIT_SEPARATOR = "_@@audit-message@@_";

    int MAX_RPE_SERVICE_START_RETRY_COUNT = 5;

    short NSQ_MESSAGE_RETRY_COUNT = 3;

    String RUNNING = "running";

    String STARTING = "starting";
}
