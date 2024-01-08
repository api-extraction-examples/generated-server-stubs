from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class EnumOptionRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, gid=None, resource_type=None, color=None, enabled=None, name=None, insert_after=None, insert_before=None):  # noqa: E501
        """EnumOptionRequest - a model defined in OpenAPI

        :param gid: The gid of this EnumOptionRequest.  # noqa: E501
        :type gid: str
        :param resource_type: The resource_type of this EnumOptionRequest.  # noqa: E501
        :type resource_type: str
        :param color: The color of this EnumOptionRequest.  # noqa: E501
        :type color: str
        :param enabled: The enabled of this EnumOptionRequest.  # noqa: E501
        :type enabled: bool
        :param name: The name of this EnumOptionRequest.  # noqa: E501
        :type name: str
        :param insert_after: The insert_after of this EnumOptionRequest.  # noqa: E501
        :type insert_after: str
        :param insert_before: The insert_before of this EnumOptionRequest.  # noqa: E501
        :type insert_before: str
        """
        self.openapi_types = {
            'gid': str,
            'resource_type': str,
            'color': str,
            'enabled': bool,
            'name': str,
            'insert_after': str,
            'insert_before': str
        }

        self.attribute_map = {
            'gid': 'gid',
            'resource_type': 'resource_type',
            'color': 'color',
            'enabled': 'enabled',
            'name': 'name',
            'insert_after': 'insert_after',
            'insert_before': 'insert_before'
        }

        self._gid = gid
        self._resource_type = resource_type
        self._color = color
        self._enabled = enabled
        self._name = name
        self._insert_after = insert_after
        self._insert_before = insert_before

    @classmethod
    def from_dict(cls, dikt) -> 'EnumOptionRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The EnumOptionRequest of this EnumOptionRequest.  # noqa: E501
        :rtype: EnumOptionRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def gid(self) -> str:
        """Gets the gid of this EnumOptionRequest.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :return: The gid of this EnumOptionRequest.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this EnumOptionRequest.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :param gid: The gid of this EnumOptionRequest.
        :type gid: str
        """

        self._gid = gid

    @property
    def resource_type(self) -> str:
        """Gets the resource_type of this EnumOptionRequest.

        The base type of this resource.  # noqa: E501

        :return: The resource_type of this EnumOptionRequest.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type: str):
        """Sets the resource_type of this EnumOptionRequest.

        The base type of this resource.  # noqa: E501

        :param resource_type: The resource_type of this EnumOptionRequest.
        :type resource_type: str
        """

        self._resource_type = resource_type

    @property
    def color(self) -> str:
        """Gets the color of this EnumOptionRequest.

        The color of the enum option. Defaults to ‘none’.  # noqa: E501

        :return: The color of this EnumOptionRequest.
        :rtype: str
        """
        return self._color

    @color.setter
    def color(self, color: str):
        """Sets the color of this EnumOptionRequest.

        The color of the enum option. Defaults to ‘none’.  # noqa: E501

        :param color: The color of this EnumOptionRequest.
        :type color: str
        """

        self._color = color

    @property
    def enabled(self) -> bool:
        """Gets the enabled of this EnumOptionRequest.

        Whether or not the enum option is a selectable value for the custom field.  # noqa: E501

        :return: The enabled of this EnumOptionRequest.
        :rtype: bool
        """
        return self._enabled

    @enabled.setter
    def enabled(self, enabled: bool):
        """Sets the enabled of this EnumOptionRequest.

        Whether or not the enum option is a selectable value for the custom field.  # noqa: E501

        :param enabled: The enabled of this EnumOptionRequest.
        :type enabled: bool
        """

        self._enabled = enabled

    @property
    def name(self) -> str:
        """Gets the name of this EnumOptionRequest.

        The name of the enum option.  # noqa: E501

        :return: The name of this EnumOptionRequest.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this EnumOptionRequest.

        The name of the enum option.  # noqa: E501

        :param name: The name of this EnumOptionRequest.
        :type name: str
        """

        self._name = name

    @property
    def insert_after(self) -> str:
        """Gets the insert_after of this EnumOptionRequest.

        An existing enum option within this custom field after which the new enum option should be inserted. Cannot be provided together with before_enum_option.  # noqa: E501

        :return: The insert_after of this EnumOptionRequest.
        :rtype: str
        """
        return self._insert_after

    @insert_after.setter
    def insert_after(self, insert_after: str):
        """Sets the insert_after of this EnumOptionRequest.

        An existing enum option within this custom field after which the new enum option should be inserted. Cannot be provided together with before_enum_option.  # noqa: E501

        :param insert_after: The insert_after of this EnumOptionRequest.
        :type insert_after: str
        """

        self._insert_after = insert_after

    @property
    def insert_before(self) -> str:
        """Gets the insert_before of this EnumOptionRequest.

        An existing enum option within this custom field before which the new enum option should be inserted. Cannot be provided together with after_enum_option.  # noqa: E501

        :return: The insert_before of this EnumOptionRequest.
        :rtype: str
        """
        return self._insert_before

    @insert_before.setter
    def insert_before(self, insert_before: str):
        """Sets the insert_before of this EnumOptionRequest.

        An existing enum option within this custom field before which the new enum option should be inserted. Cannot be provided together with after_enum_option.  # noqa: E501

        :param insert_before: The insert_before of this EnumOptionRequest.
        :type insert_before: str
        """

        self._insert_before = insert_before
