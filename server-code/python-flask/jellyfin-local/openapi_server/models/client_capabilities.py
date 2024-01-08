from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.device_profile import DeviceProfile
from openapi_server.models.general_command_type import GeneralCommandType
from openapi_server import util

from openapi_server.models.device_profile import DeviceProfile  # noqa: E501
from openapi_server.models.general_command_type import GeneralCommandType  # noqa: E501

class ClientCapabilities(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, app_store_url=None, device_profile=None, icon_url=None, message_callback_url=None, playable_media_types=None, supported_commands=None, supports_content_uploading=None, supports_media_control=None, supports_persistent_identifier=None, supports_sync=None):  # noqa: E501
        """ClientCapabilities - a model defined in OpenAPI

        :param app_store_url: The app_store_url of this ClientCapabilities.  # noqa: E501
        :type app_store_url: str
        :param device_profile: The device_profile of this ClientCapabilities.  # noqa: E501
        :type device_profile: DeviceProfile
        :param icon_url: The icon_url of this ClientCapabilities.  # noqa: E501
        :type icon_url: str
        :param message_callback_url: The message_callback_url of this ClientCapabilities.  # noqa: E501
        :type message_callback_url: str
        :param playable_media_types: The playable_media_types of this ClientCapabilities.  # noqa: E501
        :type playable_media_types: List[str]
        :param supported_commands: The supported_commands of this ClientCapabilities.  # noqa: E501
        :type supported_commands: List[GeneralCommandType]
        :param supports_content_uploading: The supports_content_uploading of this ClientCapabilities.  # noqa: E501
        :type supports_content_uploading: bool
        :param supports_media_control: The supports_media_control of this ClientCapabilities.  # noqa: E501
        :type supports_media_control: bool
        :param supports_persistent_identifier: The supports_persistent_identifier of this ClientCapabilities.  # noqa: E501
        :type supports_persistent_identifier: bool
        :param supports_sync: The supports_sync of this ClientCapabilities.  # noqa: E501
        :type supports_sync: bool
        """
        self.openapi_types = {
            'app_store_url': str,
            'device_profile': DeviceProfile,
            'icon_url': str,
            'message_callback_url': str,
            'playable_media_types': List[str],
            'supported_commands': List[GeneralCommandType],
            'supports_content_uploading': bool,
            'supports_media_control': bool,
            'supports_persistent_identifier': bool,
            'supports_sync': bool
        }

        self.attribute_map = {
            'app_store_url': 'AppStoreUrl',
            'device_profile': 'DeviceProfile',
            'icon_url': 'IconUrl',
            'message_callback_url': 'MessageCallbackUrl',
            'playable_media_types': 'PlayableMediaTypes',
            'supported_commands': 'SupportedCommands',
            'supports_content_uploading': 'SupportsContentUploading',
            'supports_media_control': 'SupportsMediaControl',
            'supports_persistent_identifier': 'SupportsPersistentIdentifier',
            'supports_sync': 'SupportsSync'
        }

        self._app_store_url = app_store_url
        self._device_profile = device_profile
        self._icon_url = icon_url
        self._message_callback_url = message_callback_url
        self._playable_media_types = playable_media_types
        self._supported_commands = supported_commands
        self._supports_content_uploading = supports_content_uploading
        self._supports_media_control = supports_media_control
        self._supports_persistent_identifier = supports_persistent_identifier
        self._supports_sync = supports_sync

    @classmethod
    def from_dict(cls, dikt) -> 'ClientCapabilities':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ClientCapabilities of this ClientCapabilities.  # noqa: E501
        :rtype: ClientCapabilities
        """
        return util.deserialize_model(dikt, cls)

    @property
    def app_store_url(self) -> str:
        """Gets the app_store_url of this ClientCapabilities.


        :return: The app_store_url of this ClientCapabilities.
        :rtype: str
        """
        return self._app_store_url

    @app_store_url.setter
    def app_store_url(self, app_store_url: str):
        """Sets the app_store_url of this ClientCapabilities.


        :param app_store_url: The app_store_url of this ClientCapabilities.
        :type app_store_url: str
        """

        self._app_store_url = app_store_url

    @property
    def device_profile(self) -> DeviceProfile:
        """Gets the device_profile of this ClientCapabilities.


        :return: The device_profile of this ClientCapabilities.
        :rtype: DeviceProfile
        """
        return self._device_profile

    @device_profile.setter
    def device_profile(self, device_profile: DeviceProfile):
        """Sets the device_profile of this ClientCapabilities.


        :param device_profile: The device_profile of this ClientCapabilities.
        :type device_profile: DeviceProfile
        """

        self._device_profile = device_profile

    @property
    def icon_url(self) -> str:
        """Gets the icon_url of this ClientCapabilities.


        :return: The icon_url of this ClientCapabilities.
        :rtype: str
        """
        return self._icon_url

    @icon_url.setter
    def icon_url(self, icon_url: str):
        """Sets the icon_url of this ClientCapabilities.


        :param icon_url: The icon_url of this ClientCapabilities.
        :type icon_url: str
        """

        self._icon_url = icon_url

    @property
    def message_callback_url(self) -> str:
        """Gets the message_callback_url of this ClientCapabilities.


        :return: The message_callback_url of this ClientCapabilities.
        :rtype: str
        """
        return self._message_callback_url

    @message_callback_url.setter
    def message_callback_url(self, message_callback_url: str):
        """Sets the message_callback_url of this ClientCapabilities.


        :param message_callback_url: The message_callback_url of this ClientCapabilities.
        :type message_callback_url: str
        """

        self._message_callback_url = message_callback_url

    @property
    def playable_media_types(self) -> List[str]:
        """Gets the playable_media_types of this ClientCapabilities.


        :return: The playable_media_types of this ClientCapabilities.
        :rtype: List[str]
        """
        return self._playable_media_types

    @playable_media_types.setter
    def playable_media_types(self, playable_media_types: List[str]):
        """Sets the playable_media_types of this ClientCapabilities.


        :param playable_media_types: The playable_media_types of this ClientCapabilities.
        :type playable_media_types: List[str]
        """

        self._playable_media_types = playable_media_types

    @property
    def supported_commands(self) -> List[GeneralCommandType]:
        """Gets the supported_commands of this ClientCapabilities.


        :return: The supported_commands of this ClientCapabilities.
        :rtype: List[GeneralCommandType]
        """
        return self._supported_commands

    @supported_commands.setter
    def supported_commands(self, supported_commands: List[GeneralCommandType]):
        """Sets the supported_commands of this ClientCapabilities.


        :param supported_commands: The supported_commands of this ClientCapabilities.
        :type supported_commands: List[GeneralCommandType]
        """

        self._supported_commands = supported_commands

    @property
    def supports_content_uploading(self) -> bool:
        """Gets the supports_content_uploading of this ClientCapabilities.


        :return: The supports_content_uploading of this ClientCapabilities.
        :rtype: bool
        """
        return self._supports_content_uploading

    @supports_content_uploading.setter
    def supports_content_uploading(self, supports_content_uploading: bool):
        """Sets the supports_content_uploading of this ClientCapabilities.


        :param supports_content_uploading: The supports_content_uploading of this ClientCapabilities.
        :type supports_content_uploading: bool
        """

        self._supports_content_uploading = supports_content_uploading

    @property
    def supports_media_control(self) -> bool:
        """Gets the supports_media_control of this ClientCapabilities.


        :return: The supports_media_control of this ClientCapabilities.
        :rtype: bool
        """
        return self._supports_media_control

    @supports_media_control.setter
    def supports_media_control(self, supports_media_control: bool):
        """Sets the supports_media_control of this ClientCapabilities.


        :param supports_media_control: The supports_media_control of this ClientCapabilities.
        :type supports_media_control: bool
        """

        self._supports_media_control = supports_media_control

    @property
    def supports_persistent_identifier(self) -> bool:
        """Gets the supports_persistent_identifier of this ClientCapabilities.


        :return: The supports_persistent_identifier of this ClientCapabilities.
        :rtype: bool
        """
        return self._supports_persistent_identifier

    @supports_persistent_identifier.setter
    def supports_persistent_identifier(self, supports_persistent_identifier: bool):
        """Sets the supports_persistent_identifier of this ClientCapabilities.


        :param supports_persistent_identifier: The supports_persistent_identifier of this ClientCapabilities.
        :type supports_persistent_identifier: bool
        """

        self._supports_persistent_identifier = supports_persistent_identifier

    @property
    def supports_sync(self) -> bool:
        """Gets the supports_sync of this ClientCapabilities.


        :return: The supports_sync of this ClientCapabilities.
        :rtype: bool
        """
        return self._supports_sync

    @supports_sync.setter
    def supports_sync(self, supports_sync: bool):
        """Sets the supports_sync of this ClientCapabilities.


        :param supports_sync: The supports_sync of this ClientCapabilities.
        :type supports_sync: bool
        """

        self._supports_sync = supports_sync