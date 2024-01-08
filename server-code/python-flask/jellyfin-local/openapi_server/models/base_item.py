from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.media_url import MediaUrl
from openapi_server import util

from openapi_server.models.media_url import MediaUrl  # noqa: E501

class BaseItem(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, container=None, date_last_saved=None, extra_ids=None, height=None, is_hd=None, is_shortcut=None, remote_trailers=None, shortcut_path=None, size=None, supports_external_transfer=None, width=None):  # noqa: E501
        """BaseItem - a model defined in OpenAPI

        :param container: The container of this BaseItem.  # noqa: E501
        :type container: str
        :param date_last_saved: The date_last_saved of this BaseItem.  # noqa: E501
        :type date_last_saved: datetime
        :param extra_ids: The extra_ids of this BaseItem.  # noqa: E501
        :type extra_ids: List[str]
        :param height: The height of this BaseItem.  # noqa: E501
        :type height: int
        :param is_hd: The is_hd of this BaseItem.  # noqa: E501
        :type is_hd: bool
        :param is_shortcut: The is_shortcut of this BaseItem.  # noqa: E501
        :type is_shortcut: bool
        :param remote_trailers: The remote_trailers of this BaseItem.  # noqa: E501
        :type remote_trailers: List[MediaUrl]
        :param shortcut_path: The shortcut_path of this BaseItem.  # noqa: E501
        :type shortcut_path: str
        :param size: The size of this BaseItem.  # noqa: E501
        :type size: int
        :param supports_external_transfer: The supports_external_transfer of this BaseItem.  # noqa: E501
        :type supports_external_transfer: bool
        :param width: The width of this BaseItem.  # noqa: E501
        :type width: int
        """
        self.openapi_types = {
            'container': str,
            'date_last_saved': datetime,
            'extra_ids': List[str],
            'height': int,
            'is_hd': bool,
            'is_shortcut': bool,
            'remote_trailers': List[MediaUrl],
            'shortcut_path': str,
            'size': int,
            'supports_external_transfer': bool,
            'width': int
        }

        self.attribute_map = {
            'container': 'Container',
            'date_last_saved': 'DateLastSaved',
            'extra_ids': 'ExtraIds',
            'height': 'Height',
            'is_hd': 'IsHD',
            'is_shortcut': 'IsShortcut',
            'remote_trailers': 'RemoteTrailers',
            'shortcut_path': 'ShortcutPath',
            'size': 'Size',
            'supports_external_transfer': 'SupportsExternalTransfer',
            'width': 'Width'
        }

        self._container = container
        self._date_last_saved = date_last_saved
        self._extra_ids = extra_ids
        self._height = height
        self._is_hd = is_hd
        self._is_shortcut = is_shortcut
        self._remote_trailers = remote_trailers
        self._shortcut_path = shortcut_path
        self._size = size
        self._supports_external_transfer = supports_external_transfer
        self._width = width

    @classmethod
    def from_dict(cls, dikt) -> 'BaseItem':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BaseItem of this BaseItem.  # noqa: E501
        :rtype: BaseItem
        """
        return util.deserialize_model(dikt, cls)

    @property
    def container(self) -> str:
        """Gets the container of this BaseItem.


        :return: The container of this BaseItem.
        :rtype: str
        """
        return self._container

    @container.setter
    def container(self, container: str):
        """Sets the container of this BaseItem.


        :param container: The container of this BaseItem.
        :type container: str
        """

        self._container = container

    @property
    def date_last_saved(self) -> datetime:
        """Gets the date_last_saved of this BaseItem.


        :return: The date_last_saved of this BaseItem.
        :rtype: datetime
        """
        return self._date_last_saved

    @date_last_saved.setter
    def date_last_saved(self, date_last_saved: datetime):
        """Sets the date_last_saved of this BaseItem.


        :param date_last_saved: The date_last_saved of this BaseItem.
        :type date_last_saved: datetime
        """

        self._date_last_saved = date_last_saved

    @property
    def extra_ids(self) -> List[str]:
        """Gets the extra_ids of this BaseItem.


        :return: The extra_ids of this BaseItem.
        :rtype: List[str]
        """
        return self._extra_ids

    @extra_ids.setter
    def extra_ids(self, extra_ids: List[str]):
        """Sets the extra_ids of this BaseItem.


        :param extra_ids: The extra_ids of this BaseItem.
        :type extra_ids: List[str]
        """

        self._extra_ids = extra_ids

    @property
    def height(self) -> int:
        """Gets the height of this BaseItem.


        :return: The height of this BaseItem.
        :rtype: int
        """
        return self._height

    @height.setter
    def height(self, height: int):
        """Sets the height of this BaseItem.


        :param height: The height of this BaseItem.
        :type height: int
        """

        self._height = height

    @property
    def is_hd(self) -> bool:
        """Gets the is_hd of this BaseItem.


        :return: The is_hd of this BaseItem.
        :rtype: bool
        """
        return self._is_hd

    @is_hd.setter
    def is_hd(self, is_hd: bool):
        """Sets the is_hd of this BaseItem.


        :param is_hd: The is_hd of this BaseItem.
        :type is_hd: bool
        """

        self._is_hd = is_hd

    @property
    def is_shortcut(self) -> bool:
        """Gets the is_shortcut of this BaseItem.


        :return: The is_shortcut of this BaseItem.
        :rtype: bool
        """
        return self._is_shortcut

    @is_shortcut.setter
    def is_shortcut(self, is_shortcut: bool):
        """Sets the is_shortcut of this BaseItem.


        :param is_shortcut: The is_shortcut of this BaseItem.
        :type is_shortcut: bool
        """

        self._is_shortcut = is_shortcut

    @property
    def remote_trailers(self) -> List[MediaUrl]:
        """Gets the remote_trailers of this BaseItem.

        Gets or sets the remote trailers.  # noqa: E501

        :return: The remote_trailers of this BaseItem.
        :rtype: List[MediaUrl]
        """
        return self._remote_trailers

    @remote_trailers.setter
    def remote_trailers(self, remote_trailers: List[MediaUrl]):
        """Sets the remote_trailers of this BaseItem.

        Gets or sets the remote trailers.  # noqa: E501

        :param remote_trailers: The remote_trailers of this BaseItem.
        :type remote_trailers: List[MediaUrl]
        """

        self._remote_trailers = remote_trailers

    @property
    def shortcut_path(self) -> str:
        """Gets the shortcut_path of this BaseItem.


        :return: The shortcut_path of this BaseItem.
        :rtype: str
        """
        return self._shortcut_path

    @shortcut_path.setter
    def shortcut_path(self, shortcut_path: str):
        """Sets the shortcut_path of this BaseItem.


        :param shortcut_path: The shortcut_path of this BaseItem.
        :type shortcut_path: str
        """

        self._shortcut_path = shortcut_path

    @property
    def size(self) -> int:
        """Gets the size of this BaseItem.


        :return: The size of this BaseItem.
        :rtype: int
        """
        return self._size

    @size.setter
    def size(self, size: int):
        """Sets the size of this BaseItem.


        :param size: The size of this BaseItem.
        :type size: int
        """

        self._size = size

    @property
    def supports_external_transfer(self) -> bool:
        """Gets the supports_external_transfer of this BaseItem.


        :return: The supports_external_transfer of this BaseItem.
        :rtype: bool
        """
        return self._supports_external_transfer

    @supports_external_transfer.setter
    def supports_external_transfer(self, supports_external_transfer: bool):
        """Sets the supports_external_transfer of this BaseItem.


        :param supports_external_transfer: The supports_external_transfer of this BaseItem.
        :type supports_external_transfer: bool
        """

        self._supports_external_transfer = supports_external_transfer

    @property
    def width(self) -> int:
        """Gets the width of this BaseItem.


        :return: The width of this BaseItem.
        :rtype: int
        """
        return self._width

    @width.setter
    def width(self, width: int):
        """Sets the width of this BaseItem.


        :param width: The width of this BaseItem.
        :type width: int
        """

        self._width = width