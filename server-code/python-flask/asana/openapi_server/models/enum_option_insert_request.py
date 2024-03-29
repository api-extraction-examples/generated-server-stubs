from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class EnumOptionInsertRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, after_enum_option=None, before_enum_option=None, enum_option=None):  # noqa: E501
        """EnumOptionInsertRequest - a model defined in OpenAPI

        :param after_enum_option: The after_enum_option of this EnumOptionInsertRequest.  # noqa: E501
        :type after_enum_option: str
        :param before_enum_option: The before_enum_option of this EnumOptionInsertRequest.  # noqa: E501
        :type before_enum_option: str
        :param enum_option: The enum_option of this EnumOptionInsertRequest.  # noqa: E501
        :type enum_option: str
        """
        self.openapi_types = {
            'after_enum_option': str,
            'before_enum_option': str,
            'enum_option': str
        }

        self.attribute_map = {
            'after_enum_option': 'after_enum_option',
            'before_enum_option': 'before_enum_option',
            'enum_option': 'enum_option'
        }

        self._after_enum_option = after_enum_option
        self._before_enum_option = before_enum_option
        self._enum_option = enum_option

    @classmethod
    def from_dict(cls, dikt) -> 'EnumOptionInsertRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The EnumOptionInsertRequest of this EnumOptionInsertRequest.  # noqa: E501
        :rtype: EnumOptionInsertRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def after_enum_option(self) -> str:
        """Gets the after_enum_option of this EnumOptionInsertRequest.

        An existing enum option within this custom field after which the new enum option should be inserted. Cannot be provided together with before_enum_option.  # noqa: E501

        :return: The after_enum_option of this EnumOptionInsertRequest.
        :rtype: str
        """
        return self._after_enum_option

    @after_enum_option.setter
    def after_enum_option(self, after_enum_option: str):
        """Sets the after_enum_option of this EnumOptionInsertRequest.

        An existing enum option within this custom field after which the new enum option should be inserted. Cannot be provided together with before_enum_option.  # noqa: E501

        :param after_enum_option: The after_enum_option of this EnumOptionInsertRequest.
        :type after_enum_option: str
        """

        self._after_enum_option = after_enum_option

    @property
    def before_enum_option(self) -> str:
        """Gets the before_enum_option of this EnumOptionInsertRequest.

        An existing enum option within this custom field before which the new enum option should be inserted. Cannot be provided together with after_enum_option.  # noqa: E501

        :return: The before_enum_option of this EnumOptionInsertRequest.
        :rtype: str
        """
        return self._before_enum_option

    @before_enum_option.setter
    def before_enum_option(self, before_enum_option: str):
        """Sets the before_enum_option of this EnumOptionInsertRequest.

        An existing enum option within this custom field before which the new enum option should be inserted. Cannot be provided together with after_enum_option.  # noqa: E501

        :param before_enum_option: The before_enum_option of this EnumOptionInsertRequest.
        :type before_enum_option: str
        """

        self._before_enum_option = before_enum_option

    @property
    def enum_option(self) -> str:
        """Gets the enum_option of this EnumOptionInsertRequest.

        The gid of the enum option to relocate.  # noqa: E501

        :return: The enum_option of this EnumOptionInsertRequest.
        :rtype: str
        """
        return self._enum_option

    @enum_option.setter
    def enum_option(self, enum_option: str):
        """Sets the enum_option of this EnumOptionInsertRequest.

        The gid of the enum option to relocate.  # noqa: E501

        :param enum_option: The enum_option of this EnumOptionInsertRequest.
        :type enum_option: str
        """
        if enum_option is None:
            raise ValueError("Invalid value for `enum_option`, must not be `None`")  # noqa: E501

        self._enum_option = enum_option
