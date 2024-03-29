from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class MountTmpfsOptions(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, mode=None, size_bytes=None):  # noqa: E501
        """MountTmpfsOptions - a model defined in OpenAPI

        :param mode: The mode of this MountTmpfsOptions.  # noqa: E501
        :type mode: int
        :param size_bytes: The size_bytes of this MountTmpfsOptions.  # noqa: E501
        :type size_bytes: int
        """
        self.openapi_types = {
            'mode': int,
            'size_bytes': int
        }

        self.attribute_map = {
            'mode': 'Mode',
            'size_bytes': 'SizeBytes'
        }

        self._mode = mode
        self._size_bytes = size_bytes

    @classmethod
    def from_dict(cls, dikt) -> 'MountTmpfsOptions':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Mount_TmpfsOptions of this MountTmpfsOptions.  # noqa: E501
        :rtype: MountTmpfsOptions
        """
        return util.deserialize_model(dikt, cls)

    @property
    def mode(self) -> int:
        """Gets the mode of this MountTmpfsOptions.

        The permission mode for the tmpfs mount in an integer.  # noqa: E501

        :return: The mode of this MountTmpfsOptions.
        :rtype: int
        """
        return self._mode

    @mode.setter
    def mode(self, mode: int):
        """Sets the mode of this MountTmpfsOptions.

        The permission mode for the tmpfs mount in an integer.  # noqa: E501

        :param mode: The mode of this MountTmpfsOptions.
        :type mode: int
        """

        self._mode = mode

    @property
    def size_bytes(self) -> int:
        """Gets the size_bytes of this MountTmpfsOptions.

        The size for the tmpfs mount in bytes.  # noqa: E501

        :return: The size_bytes of this MountTmpfsOptions.
        :rtype: int
        """
        return self._size_bytes

    @size_bytes.setter
    def size_bytes(self, size_bytes: int):
        """Sets the size_bytes of this MountTmpfsOptions.

        The size for the tmpfs mount in bytes.  # noqa: E501

        :param size_bytes: The size_bytes of this MountTmpfsOptions.
        :type size_bytes: int
        """

        self._size_bytes = size_bytes
