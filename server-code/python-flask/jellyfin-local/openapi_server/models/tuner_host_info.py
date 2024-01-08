from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class TunerHostInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, allow_hw_transcoding=None, device_id=None, enable_stream_looping=None, friendly_name=None, id=None, import_favorites_only=None, source=None, tuner_count=None, type=None, url=None, user_agent=None):  # noqa: E501
        """TunerHostInfo - a model defined in OpenAPI

        :param allow_hw_transcoding: The allow_hw_transcoding of this TunerHostInfo.  # noqa: E501
        :type allow_hw_transcoding: bool
        :param device_id: The device_id of this TunerHostInfo.  # noqa: E501
        :type device_id: str
        :param enable_stream_looping: The enable_stream_looping of this TunerHostInfo.  # noqa: E501
        :type enable_stream_looping: bool
        :param friendly_name: The friendly_name of this TunerHostInfo.  # noqa: E501
        :type friendly_name: str
        :param id: The id of this TunerHostInfo.  # noqa: E501
        :type id: str
        :param import_favorites_only: The import_favorites_only of this TunerHostInfo.  # noqa: E501
        :type import_favorites_only: bool
        :param source: The source of this TunerHostInfo.  # noqa: E501
        :type source: str
        :param tuner_count: The tuner_count of this TunerHostInfo.  # noqa: E501
        :type tuner_count: int
        :param type: The type of this TunerHostInfo.  # noqa: E501
        :type type: str
        :param url: The url of this TunerHostInfo.  # noqa: E501
        :type url: str
        :param user_agent: The user_agent of this TunerHostInfo.  # noqa: E501
        :type user_agent: str
        """
        self.openapi_types = {
            'allow_hw_transcoding': bool,
            'device_id': str,
            'enable_stream_looping': bool,
            'friendly_name': str,
            'id': str,
            'import_favorites_only': bool,
            'source': str,
            'tuner_count': int,
            'type': str,
            'url': str,
            'user_agent': str
        }

        self.attribute_map = {
            'allow_hw_transcoding': 'AllowHWTranscoding',
            'device_id': 'DeviceId',
            'enable_stream_looping': 'EnableStreamLooping',
            'friendly_name': 'FriendlyName',
            'id': 'Id',
            'import_favorites_only': 'ImportFavoritesOnly',
            'source': 'Source',
            'tuner_count': 'TunerCount',
            'type': 'Type',
            'url': 'Url',
            'user_agent': 'UserAgent'
        }

        self._allow_hw_transcoding = allow_hw_transcoding
        self._device_id = device_id
        self._enable_stream_looping = enable_stream_looping
        self._friendly_name = friendly_name
        self._id = id
        self._import_favorites_only = import_favorites_only
        self._source = source
        self._tuner_count = tuner_count
        self._type = type
        self._url = url
        self._user_agent = user_agent

    @classmethod
    def from_dict(cls, dikt) -> 'TunerHostInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TunerHostInfo of this TunerHostInfo.  # noqa: E501
        :rtype: TunerHostInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def allow_hw_transcoding(self) -> bool:
        """Gets the allow_hw_transcoding of this TunerHostInfo.


        :return: The allow_hw_transcoding of this TunerHostInfo.
        :rtype: bool
        """
        return self._allow_hw_transcoding

    @allow_hw_transcoding.setter
    def allow_hw_transcoding(self, allow_hw_transcoding: bool):
        """Sets the allow_hw_transcoding of this TunerHostInfo.


        :param allow_hw_transcoding: The allow_hw_transcoding of this TunerHostInfo.
        :type allow_hw_transcoding: bool
        """

        self._allow_hw_transcoding = allow_hw_transcoding

    @property
    def device_id(self) -> str:
        """Gets the device_id of this TunerHostInfo.


        :return: The device_id of this TunerHostInfo.
        :rtype: str
        """
        return self._device_id

    @device_id.setter
    def device_id(self, device_id: str):
        """Sets the device_id of this TunerHostInfo.


        :param device_id: The device_id of this TunerHostInfo.
        :type device_id: str
        """

        self._device_id = device_id

    @property
    def enable_stream_looping(self) -> bool:
        """Gets the enable_stream_looping of this TunerHostInfo.


        :return: The enable_stream_looping of this TunerHostInfo.
        :rtype: bool
        """
        return self._enable_stream_looping

    @enable_stream_looping.setter
    def enable_stream_looping(self, enable_stream_looping: bool):
        """Sets the enable_stream_looping of this TunerHostInfo.


        :param enable_stream_looping: The enable_stream_looping of this TunerHostInfo.
        :type enable_stream_looping: bool
        """

        self._enable_stream_looping = enable_stream_looping

    @property
    def friendly_name(self) -> str:
        """Gets the friendly_name of this TunerHostInfo.


        :return: The friendly_name of this TunerHostInfo.
        :rtype: str
        """
        return self._friendly_name

    @friendly_name.setter
    def friendly_name(self, friendly_name: str):
        """Sets the friendly_name of this TunerHostInfo.


        :param friendly_name: The friendly_name of this TunerHostInfo.
        :type friendly_name: str
        """

        self._friendly_name = friendly_name

    @property
    def id(self) -> str:
        """Gets the id of this TunerHostInfo.


        :return: The id of this TunerHostInfo.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this TunerHostInfo.


        :param id: The id of this TunerHostInfo.
        :type id: str
        """

        self._id = id

    @property
    def import_favorites_only(self) -> bool:
        """Gets the import_favorites_only of this TunerHostInfo.


        :return: The import_favorites_only of this TunerHostInfo.
        :rtype: bool
        """
        return self._import_favorites_only

    @import_favorites_only.setter
    def import_favorites_only(self, import_favorites_only: bool):
        """Sets the import_favorites_only of this TunerHostInfo.


        :param import_favorites_only: The import_favorites_only of this TunerHostInfo.
        :type import_favorites_only: bool
        """

        self._import_favorites_only = import_favorites_only

    @property
    def source(self) -> str:
        """Gets the source of this TunerHostInfo.


        :return: The source of this TunerHostInfo.
        :rtype: str
        """
        return self._source

    @source.setter
    def source(self, source: str):
        """Sets the source of this TunerHostInfo.


        :param source: The source of this TunerHostInfo.
        :type source: str
        """

        self._source = source

    @property
    def tuner_count(self) -> int:
        """Gets the tuner_count of this TunerHostInfo.


        :return: The tuner_count of this TunerHostInfo.
        :rtype: int
        """
        return self._tuner_count

    @tuner_count.setter
    def tuner_count(self, tuner_count: int):
        """Sets the tuner_count of this TunerHostInfo.


        :param tuner_count: The tuner_count of this TunerHostInfo.
        :type tuner_count: int
        """

        self._tuner_count = tuner_count

    @property
    def type(self) -> str:
        """Gets the type of this TunerHostInfo.


        :return: The type of this TunerHostInfo.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this TunerHostInfo.


        :param type: The type of this TunerHostInfo.
        :type type: str
        """

        self._type = type

    @property
    def url(self) -> str:
        """Gets the url of this TunerHostInfo.


        :return: The url of this TunerHostInfo.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url: str):
        """Sets the url of this TunerHostInfo.


        :param url: The url of this TunerHostInfo.
        :type url: str
        """

        self._url = url

    @property
    def user_agent(self) -> str:
        """Gets the user_agent of this TunerHostInfo.


        :return: The user_agent of this TunerHostInfo.
        :rtype: str
        """
        return self._user_agent

    @user_agent.setter
    def user_agent(self, user_agent: str):
        """Sets the user_agent of this TunerHostInfo.


        :param user_agent: The user_agent of this TunerHostInfo.
        :type user_agent: str
        """

        self._user_agent = user_agent
