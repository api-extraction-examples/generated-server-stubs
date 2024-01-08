from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.architecture import Architecture
from openapi_server.models.f_fmpeg_location import FFmpegLocation
from openapi_server.models.installation_info import InstallationInfo
from openapi_server import util

from openapi_server.models.architecture import Architecture  # noqa: E501
from openapi_server.models.f_fmpeg_location import FFmpegLocation  # noqa: E501
from openapi_server.models.installation_info import InstallationInfo  # noqa: E501

class SystemInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, cache_path=None, can_launch_web_browser=None, can_self_restart=None, completed_installations=None, encoder_location=None, has_pending_restart=None, has_update_available=None, id=None, internal_metadata_path=None, is_shutting_down=None, items_by_name_path=None, local_address=None, log_path=None, operating_system=None, operating_system_display_name=None, package_name=None, product_name=None, program_data_path=None, server_name=None, startup_wizard_completed=None, supports_library_monitor=None, system_architecture=None, transcoding_temp_path=None, version=None, web_path=None, web_socket_port_number=None):  # noqa: E501
        """SystemInfo - a model defined in OpenAPI

        :param cache_path: The cache_path of this SystemInfo.  # noqa: E501
        :type cache_path: str
        :param can_launch_web_browser: The can_launch_web_browser of this SystemInfo.  # noqa: E501
        :type can_launch_web_browser: bool
        :param can_self_restart: The can_self_restart of this SystemInfo.  # noqa: E501
        :type can_self_restart: bool
        :param completed_installations: The completed_installations of this SystemInfo.  # noqa: E501
        :type completed_installations: List[InstallationInfo]
        :param encoder_location: The encoder_location of this SystemInfo.  # noqa: E501
        :type encoder_location: FFmpegLocation
        :param has_pending_restart: The has_pending_restart of this SystemInfo.  # noqa: E501
        :type has_pending_restart: bool
        :param has_update_available: The has_update_available of this SystemInfo.  # noqa: E501
        :type has_update_available: bool
        :param id: The id of this SystemInfo.  # noqa: E501
        :type id: str
        :param internal_metadata_path: The internal_metadata_path of this SystemInfo.  # noqa: E501
        :type internal_metadata_path: str
        :param is_shutting_down: The is_shutting_down of this SystemInfo.  # noqa: E501
        :type is_shutting_down: bool
        :param items_by_name_path: The items_by_name_path of this SystemInfo.  # noqa: E501
        :type items_by_name_path: str
        :param local_address: The local_address of this SystemInfo.  # noqa: E501
        :type local_address: str
        :param log_path: The log_path of this SystemInfo.  # noqa: E501
        :type log_path: str
        :param operating_system: The operating_system of this SystemInfo.  # noqa: E501
        :type operating_system: str
        :param operating_system_display_name: The operating_system_display_name of this SystemInfo.  # noqa: E501
        :type operating_system_display_name: str
        :param package_name: The package_name of this SystemInfo.  # noqa: E501
        :type package_name: str
        :param product_name: The product_name of this SystemInfo.  # noqa: E501
        :type product_name: str
        :param program_data_path: The program_data_path of this SystemInfo.  # noqa: E501
        :type program_data_path: str
        :param server_name: The server_name of this SystemInfo.  # noqa: E501
        :type server_name: str
        :param startup_wizard_completed: The startup_wizard_completed of this SystemInfo.  # noqa: E501
        :type startup_wizard_completed: bool
        :param supports_library_monitor: The supports_library_monitor of this SystemInfo.  # noqa: E501
        :type supports_library_monitor: bool
        :param system_architecture: The system_architecture of this SystemInfo.  # noqa: E501
        :type system_architecture: Architecture
        :param transcoding_temp_path: The transcoding_temp_path of this SystemInfo.  # noqa: E501
        :type transcoding_temp_path: str
        :param version: The version of this SystemInfo.  # noqa: E501
        :type version: str
        :param web_path: The web_path of this SystemInfo.  # noqa: E501
        :type web_path: str
        :param web_socket_port_number: The web_socket_port_number of this SystemInfo.  # noqa: E501
        :type web_socket_port_number: int
        """
        self.openapi_types = {
            'cache_path': str,
            'can_launch_web_browser': bool,
            'can_self_restart': bool,
            'completed_installations': List[InstallationInfo],
            'encoder_location': FFmpegLocation,
            'has_pending_restart': bool,
            'has_update_available': bool,
            'id': str,
            'internal_metadata_path': str,
            'is_shutting_down': bool,
            'items_by_name_path': str,
            'local_address': str,
            'log_path': str,
            'operating_system': str,
            'operating_system_display_name': str,
            'package_name': str,
            'product_name': str,
            'program_data_path': str,
            'server_name': str,
            'startup_wizard_completed': bool,
            'supports_library_monitor': bool,
            'system_architecture': Architecture,
            'transcoding_temp_path': str,
            'version': str,
            'web_path': str,
            'web_socket_port_number': int
        }

        self.attribute_map = {
            'cache_path': 'CachePath',
            'can_launch_web_browser': 'CanLaunchWebBrowser',
            'can_self_restart': 'CanSelfRestart',
            'completed_installations': 'CompletedInstallations',
            'encoder_location': 'EncoderLocation',
            'has_pending_restart': 'HasPendingRestart',
            'has_update_available': 'HasUpdateAvailable',
            'id': 'Id',
            'internal_metadata_path': 'InternalMetadataPath',
            'is_shutting_down': 'IsShuttingDown',
            'items_by_name_path': 'ItemsByNamePath',
            'local_address': 'LocalAddress',
            'log_path': 'LogPath',
            'operating_system': 'OperatingSystem',
            'operating_system_display_name': 'OperatingSystemDisplayName',
            'package_name': 'PackageName',
            'product_name': 'ProductName',
            'program_data_path': 'ProgramDataPath',
            'server_name': 'ServerName',
            'startup_wizard_completed': 'StartupWizardCompleted',
            'supports_library_monitor': 'SupportsLibraryMonitor',
            'system_architecture': 'SystemArchitecture',
            'transcoding_temp_path': 'TranscodingTempPath',
            'version': 'Version',
            'web_path': 'WebPath',
            'web_socket_port_number': 'WebSocketPortNumber'
        }

        self._cache_path = cache_path
        self._can_launch_web_browser = can_launch_web_browser
        self._can_self_restart = can_self_restart
        self._completed_installations = completed_installations
        self._encoder_location = encoder_location
        self._has_pending_restart = has_pending_restart
        self._has_update_available = has_update_available
        self._id = id
        self._internal_metadata_path = internal_metadata_path
        self._is_shutting_down = is_shutting_down
        self._items_by_name_path = items_by_name_path
        self._local_address = local_address
        self._log_path = log_path
        self._operating_system = operating_system
        self._operating_system_display_name = operating_system_display_name
        self._package_name = package_name
        self._product_name = product_name
        self._program_data_path = program_data_path
        self._server_name = server_name
        self._startup_wizard_completed = startup_wizard_completed
        self._supports_library_monitor = supports_library_monitor
        self._system_architecture = system_architecture
        self._transcoding_temp_path = transcoding_temp_path
        self._version = version
        self._web_path = web_path
        self._web_socket_port_number = web_socket_port_number

    @classmethod
    def from_dict(cls, dikt) -> 'SystemInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SystemInfo of this SystemInfo.  # noqa: E501
        :rtype: SystemInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def cache_path(self) -> str:
        """Gets the cache_path of this SystemInfo.

        Gets or sets the cache path.  # noqa: E501

        :return: The cache_path of this SystemInfo.
        :rtype: str
        """
        return self._cache_path

    @cache_path.setter
    def cache_path(self, cache_path: str):
        """Sets the cache_path of this SystemInfo.

        Gets or sets the cache path.  # noqa: E501

        :param cache_path: The cache_path of this SystemInfo.
        :type cache_path: str
        """

        self._cache_path = cache_path

    @property
    def can_launch_web_browser(self) -> bool:
        """Gets the can_launch_web_browser of this SystemInfo.


        :return: The can_launch_web_browser of this SystemInfo.
        :rtype: bool
        """
        return self._can_launch_web_browser

    @can_launch_web_browser.setter
    def can_launch_web_browser(self, can_launch_web_browser: bool):
        """Sets the can_launch_web_browser of this SystemInfo.


        :param can_launch_web_browser: The can_launch_web_browser of this SystemInfo.
        :type can_launch_web_browser: bool
        """

        self._can_launch_web_browser = can_launch_web_browser

    @property
    def can_self_restart(self) -> bool:
        """Gets the can_self_restart of this SystemInfo.

        Gets or sets a value indicating whether this instance can self restart.  # noqa: E501

        :return: The can_self_restart of this SystemInfo.
        :rtype: bool
        """
        return self._can_self_restart

    @can_self_restart.setter
    def can_self_restart(self, can_self_restart: bool):
        """Sets the can_self_restart of this SystemInfo.

        Gets or sets a value indicating whether this instance can self restart.  # noqa: E501

        :param can_self_restart: The can_self_restart of this SystemInfo.
        :type can_self_restart: bool
        """

        self._can_self_restart = can_self_restart

    @property
    def completed_installations(self) -> List[InstallationInfo]:
        """Gets the completed_installations of this SystemInfo.

        Gets or sets the completed installations.  # noqa: E501

        :return: The completed_installations of this SystemInfo.
        :rtype: List[InstallationInfo]
        """
        return self._completed_installations

    @completed_installations.setter
    def completed_installations(self, completed_installations: List[InstallationInfo]):
        """Sets the completed_installations of this SystemInfo.

        Gets or sets the completed installations.  # noqa: E501

        :param completed_installations: The completed_installations of this SystemInfo.
        :type completed_installations: List[InstallationInfo]
        """

        self._completed_installations = completed_installations

    @property
    def encoder_location(self) -> FFmpegLocation:
        """Gets the encoder_location of this SystemInfo.


        :return: The encoder_location of this SystemInfo.
        :rtype: FFmpegLocation
        """
        return self._encoder_location

    @encoder_location.setter
    def encoder_location(self, encoder_location: FFmpegLocation):
        """Sets the encoder_location of this SystemInfo.


        :param encoder_location: The encoder_location of this SystemInfo.
        :type encoder_location: FFmpegLocation
        """

        self._encoder_location = encoder_location

    @property
    def has_pending_restart(self) -> bool:
        """Gets the has_pending_restart of this SystemInfo.

        Gets or sets a value indicating whether this instance has pending restart.  # noqa: E501

        :return: The has_pending_restart of this SystemInfo.
        :rtype: bool
        """
        return self._has_pending_restart

    @has_pending_restart.setter
    def has_pending_restart(self, has_pending_restart: bool):
        """Sets the has_pending_restart of this SystemInfo.

        Gets or sets a value indicating whether this instance has pending restart.  # noqa: E501

        :param has_pending_restart: The has_pending_restart of this SystemInfo.
        :type has_pending_restart: bool
        """

        self._has_pending_restart = has_pending_restart

    @property
    def has_update_available(self) -> bool:
        """Gets the has_update_available of this SystemInfo.

        Gets or sets a value indicating whether this instance has update available.  # noqa: E501

        :return: The has_update_available of this SystemInfo.
        :rtype: bool
        """
        return self._has_update_available

    @has_update_available.setter
    def has_update_available(self, has_update_available: bool):
        """Sets the has_update_available of this SystemInfo.

        Gets or sets a value indicating whether this instance has update available.  # noqa: E501

        :param has_update_available: The has_update_available of this SystemInfo.
        :type has_update_available: bool
        """

        self._has_update_available = has_update_available

    @property
    def id(self) -> str:
        """Gets the id of this SystemInfo.

        Gets or sets the id.  # noqa: E501

        :return: The id of this SystemInfo.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this SystemInfo.

        Gets or sets the id.  # noqa: E501

        :param id: The id of this SystemInfo.
        :type id: str
        """

        self._id = id

    @property
    def internal_metadata_path(self) -> str:
        """Gets the internal_metadata_path of this SystemInfo.

        Gets or sets the internal metadata path.  # noqa: E501

        :return: The internal_metadata_path of this SystemInfo.
        :rtype: str
        """
        return self._internal_metadata_path

    @internal_metadata_path.setter
    def internal_metadata_path(self, internal_metadata_path: str):
        """Sets the internal_metadata_path of this SystemInfo.

        Gets or sets the internal metadata path.  # noqa: E501

        :param internal_metadata_path: The internal_metadata_path of this SystemInfo.
        :type internal_metadata_path: str
        """

        self._internal_metadata_path = internal_metadata_path

    @property
    def is_shutting_down(self) -> bool:
        """Gets the is_shutting_down of this SystemInfo.


        :return: The is_shutting_down of this SystemInfo.
        :rtype: bool
        """
        return self._is_shutting_down

    @is_shutting_down.setter
    def is_shutting_down(self, is_shutting_down: bool):
        """Sets the is_shutting_down of this SystemInfo.


        :param is_shutting_down: The is_shutting_down of this SystemInfo.
        :type is_shutting_down: bool
        """

        self._is_shutting_down = is_shutting_down

    @property
    def items_by_name_path(self) -> str:
        """Gets the items_by_name_path of this SystemInfo.

        Gets or sets the items by name path.  # noqa: E501

        :return: The items_by_name_path of this SystemInfo.
        :rtype: str
        """
        return self._items_by_name_path

    @items_by_name_path.setter
    def items_by_name_path(self, items_by_name_path: str):
        """Sets the items_by_name_path of this SystemInfo.

        Gets or sets the items by name path.  # noqa: E501

        :param items_by_name_path: The items_by_name_path of this SystemInfo.
        :type items_by_name_path: str
        """

        self._items_by_name_path = items_by_name_path

    @property
    def local_address(self) -> str:
        """Gets the local_address of this SystemInfo.

        Gets or sets the local address.  # noqa: E501

        :return: The local_address of this SystemInfo.
        :rtype: str
        """
        return self._local_address

    @local_address.setter
    def local_address(self, local_address: str):
        """Sets the local_address of this SystemInfo.

        Gets or sets the local address.  # noqa: E501

        :param local_address: The local_address of this SystemInfo.
        :type local_address: str
        """

        self._local_address = local_address

    @property
    def log_path(self) -> str:
        """Gets the log_path of this SystemInfo.

        Gets or sets the log path.  # noqa: E501

        :return: The log_path of this SystemInfo.
        :rtype: str
        """
        return self._log_path

    @log_path.setter
    def log_path(self, log_path: str):
        """Sets the log_path of this SystemInfo.

        Gets or sets the log path.  # noqa: E501

        :param log_path: The log_path of this SystemInfo.
        :type log_path: str
        """

        self._log_path = log_path

    @property
    def operating_system(self) -> str:
        """Gets the operating_system of this SystemInfo.

        Gets or sets the operating system.  # noqa: E501

        :return: The operating_system of this SystemInfo.
        :rtype: str
        """
        return self._operating_system

    @operating_system.setter
    def operating_system(self, operating_system: str):
        """Sets the operating_system of this SystemInfo.

        Gets or sets the operating system.  # noqa: E501

        :param operating_system: The operating_system of this SystemInfo.
        :type operating_system: str
        """

        self._operating_system = operating_system

    @property
    def operating_system_display_name(self) -> str:
        """Gets the operating_system_display_name of this SystemInfo.

        Gets or sets the display name of the operating system.  # noqa: E501

        :return: The operating_system_display_name of this SystemInfo.
        :rtype: str
        """
        return self._operating_system_display_name

    @operating_system_display_name.setter
    def operating_system_display_name(self, operating_system_display_name: str):
        """Sets the operating_system_display_name of this SystemInfo.

        Gets or sets the display name of the operating system.  # noqa: E501

        :param operating_system_display_name: The operating_system_display_name of this SystemInfo.
        :type operating_system_display_name: str
        """

        self._operating_system_display_name = operating_system_display_name

    @property
    def package_name(self) -> str:
        """Gets the package_name of this SystemInfo.

        Get or sets the package name.  # noqa: E501

        :return: The package_name of this SystemInfo.
        :rtype: str
        """
        return self._package_name

    @package_name.setter
    def package_name(self, package_name: str):
        """Sets the package_name of this SystemInfo.

        Get or sets the package name.  # noqa: E501

        :param package_name: The package_name of this SystemInfo.
        :type package_name: str
        """

        self._package_name = package_name

    @property
    def product_name(self) -> str:
        """Gets the product_name of this SystemInfo.

        Gets or sets the product name. This is the AssemblyProduct name.  # noqa: E501

        :return: The product_name of this SystemInfo.
        :rtype: str
        """
        return self._product_name

    @product_name.setter
    def product_name(self, product_name: str):
        """Sets the product_name of this SystemInfo.

        Gets or sets the product name. This is the AssemblyProduct name.  # noqa: E501

        :param product_name: The product_name of this SystemInfo.
        :type product_name: str
        """

        self._product_name = product_name

    @property
    def program_data_path(self) -> str:
        """Gets the program_data_path of this SystemInfo.

        Gets or sets the program data path.  # noqa: E501

        :return: The program_data_path of this SystemInfo.
        :rtype: str
        """
        return self._program_data_path

    @program_data_path.setter
    def program_data_path(self, program_data_path: str):
        """Sets the program_data_path of this SystemInfo.

        Gets or sets the program data path.  # noqa: E501

        :param program_data_path: The program_data_path of this SystemInfo.
        :type program_data_path: str
        """

        self._program_data_path = program_data_path

    @property
    def server_name(self) -> str:
        """Gets the server_name of this SystemInfo.

        Gets or sets the name of the server.  # noqa: E501

        :return: The server_name of this SystemInfo.
        :rtype: str
        """
        return self._server_name

    @server_name.setter
    def server_name(self, server_name: str):
        """Sets the server_name of this SystemInfo.

        Gets or sets the name of the server.  # noqa: E501

        :param server_name: The server_name of this SystemInfo.
        :type server_name: str
        """

        self._server_name = server_name

    @property
    def startup_wizard_completed(self) -> bool:
        """Gets the startup_wizard_completed of this SystemInfo.

        Gets or sets a value indicating whether the startup wizard is completed.  # noqa: E501

        :return: The startup_wizard_completed of this SystemInfo.
        :rtype: bool
        """
        return self._startup_wizard_completed

    @startup_wizard_completed.setter
    def startup_wizard_completed(self, startup_wizard_completed: bool):
        """Sets the startup_wizard_completed of this SystemInfo.

        Gets or sets a value indicating whether the startup wizard is completed.  # noqa: E501

        :param startup_wizard_completed: The startup_wizard_completed of this SystemInfo.
        :type startup_wizard_completed: bool
        """

        self._startup_wizard_completed = startup_wizard_completed

    @property
    def supports_library_monitor(self) -> bool:
        """Gets the supports_library_monitor of this SystemInfo.

        Gets or sets a value indicating whether [supports library monitor].  # noqa: E501

        :return: The supports_library_monitor of this SystemInfo.
        :rtype: bool
        """
        return self._supports_library_monitor

    @supports_library_monitor.setter
    def supports_library_monitor(self, supports_library_monitor: bool):
        """Sets the supports_library_monitor of this SystemInfo.

        Gets or sets a value indicating whether [supports library monitor].  # noqa: E501

        :param supports_library_monitor: The supports_library_monitor of this SystemInfo.
        :type supports_library_monitor: bool
        """

        self._supports_library_monitor = supports_library_monitor

    @property
    def system_architecture(self) -> Architecture:
        """Gets the system_architecture of this SystemInfo.


        :return: The system_architecture of this SystemInfo.
        :rtype: Architecture
        """
        return self._system_architecture

    @system_architecture.setter
    def system_architecture(self, system_architecture: Architecture):
        """Sets the system_architecture of this SystemInfo.


        :param system_architecture: The system_architecture of this SystemInfo.
        :type system_architecture: Architecture
        """

        self._system_architecture = system_architecture

    @property
    def transcoding_temp_path(self) -> str:
        """Gets the transcoding_temp_path of this SystemInfo.

        Gets or sets the transcode path.  # noqa: E501

        :return: The transcoding_temp_path of this SystemInfo.
        :rtype: str
        """
        return self._transcoding_temp_path

    @transcoding_temp_path.setter
    def transcoding_temp_path(self, transcoding_temp_path: str):
        """Sets the transcoding_temp_path of this SystemInfo.

        Gets or sets the transcode path.  # noqa: E501

        :param transcoding_temp_path: The transcoding_temp_path of this SystemInfo.
        :type transcoding_temp_path: str
        """

        self._transcoding_temp_path = transcoding_temp_path

    @property
    def version(self) -> str:
        """Gets the version of this SystemInfo.

        Gets or sets the server version.  # noqa: E501

        :return: The version of this SystemInfo.
        :rtype: str
        """
        return self._version

    @version.setter
    def version(self, version: str):
        """Sets the version of this SystemInfo.

        Gets or sets the server version.  # noqa: E501

        :param version: The version of this SystemInfo.
        :type version: str
        """

        self._version = version

    @property
    def web_path(self) -> str:
        """Gets the web_path of this SystemInfo.

        Gets or sets the web UI resources path.  # noqa: E501

        :return: The web_path of this SystemInfo.
        :rtype: str
        """
        return self._web_path

    @web_path.setter
    def web_path(self, web_path: str):
        """Sets the web_path of this SystemInfo.

        Gets or sets the web UI resources path.  # noqa: E501

        :param web_path: The web_path of this SystemInfo.
        :type web_path: str
        """

        self._web_path = web_path

    @property
    def web_socket_port_number(self) -> int:
        """Gets the web_socket_port_number of this SystemInfo.

        Gets or sets the web socket port number.  # noqa: E501

        :return: The web_socket_port_number of this SystemInfo.
        :rtype: int
        """
        return self._web_socket_port_number

    @web_socket_port_number.setter
    def web_socket_port_number(self, web_socket_port_number: int):
        """Sets the web_socket_port_number of this SystemInfo.

        Gets or sets the web socket port number.  # noqa: E501

        :param web_socket_port_number: The web_socket_port_number of this SystemInfo.
        :type web_socket_port_number: int
        """

        self._web_socket_port_number = web_socket_port_number
