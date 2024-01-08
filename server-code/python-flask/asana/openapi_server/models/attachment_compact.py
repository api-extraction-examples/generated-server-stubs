from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class AttachmentCompact(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, gid=None, resource_type=None, name=None, resource_subtype=None):  # noqa: E501
        """AttachmentCompact - a model defined in OpenAPI

        :param gid: The gid of this AttachmentCompact.  # noqa: E501
        :type gid: str
        :param resource_type: The resource_type of this AttachmentCompact.  # noqa: E501
        :type resource_type: str
        :param name: The name of this AttachmentCompact.  # noqa: E501
        :type name: str
        :param resource_subtype: The resource_subtype of this AttachmentCompact.  # noqa: E501
        :type resource_subtype: str
        """
        self.openapi_types = {
            'gid': str,
            'resource_type': str,
            'name': str,
            'resource_subtype': str
        }

        self.attribute_map = {
            'gid': 'gid',
            'resource_type': 'resource_type',
            'name': 'name',
            'resource_subtype': 'resource_subtype'
        }

        self._gid = gid
        self._resource_type = resource_type
        self._name = name
        self._resource_subtype = resource_subtype

    @classmethod
    def from_dict(cls, dikt) -> 'AttachmentCompact':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AttachmentCompact of this AttachmentCompact.  # noqa: E501
        :rtype: AttachmentCompact
        """
        return util.deserialize_model(dikt, cls)

    @property
    def gid(self) -> str:
        """Gets the gid of this AttachmentCompact.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :return: The gid of this AttachmentCompact.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this AttachmentCompact.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :param gid: The gid of this AttachmentCompact.
        :type gid: str
        """

        self._gid = gid

    @property
    def resource_type(self) -> str:
        """Gets the resource_type of this AttachmentCompact.

        The base type of this resource.  # noqa: E501

        :return: The resource_type of this AttachmentCompact.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type: str):
        """Sets the resource_type of this AttachmentCompact.

        The base type of this resource.  # noqa: E501

        :param resource_type: The resource_type of this AttachmentCompact.
        :type resource_type: str
        """

        self._resource_type = resource_type

    @property
    def name(self) -> str:
        """Gets the name of this AttachmentCompact.

        The name of the file.  # noqa: E501

        :return: The name of this AttachmentCompact.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this AttachmentCompact.

        The name of the file.  # noqa: E501

        :param name: The name of this AttachmentCompact.
        :type name: str
        """

        self._name = name

    @property
    def resource_subtype(self) -> str:
        """Gets the resource_subtype of this AttachmentCompact.

        The service hosting the attachment. Valid values are `asana`, `dropbox`, `gdrive`, `onedrive`, `box`, `vimeo`, and `external`.  # noqa: E501

        :return: The resource_subtype of this AttachmentCompact.
        :rtype: str
        """
        return self._resource_subtype

    @resource_subtype.setter
    def resource_subtype(self, resource_subtype: str):
        """Sets the resource_subtype of this AttachmentCompact.

        The service hosting the attachment. Valid values are `asana`, `dropbox`, `gdrive`, `onedrive`, `box`, `vimeo`, and `external`.  # noqa: E501

        :param resource_subtype: The resource_subtype of this AttachmentCompact.
        :type resource_subtype: str
        """

        self._resource_subtype = resource_subtype
