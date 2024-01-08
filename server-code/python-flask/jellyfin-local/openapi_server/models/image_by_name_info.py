from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ImageByNameInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, context=None, file_length=None, format=None, name=None, theme=None):  # noqa: E501
        """ImageByNameInfo - a model defined in OpenAPI

        :param context: The context of this ImageByNameInfo.  # noqa: E501
        :type context: str
        :param file_length: The file_length of this ImageByNameInfo.  # noqa: E501
        :type file_length: int
        :param format: The format of this ImageByNameInfo.  # noqa: E501
        :type format: str
        :param name: The name of this ImageByNameInfo.  # noqa: E501
        :type name: str
        :param theme: The theme of this ImageByNameInfo.  # noqa: E501
        :type theme: str
        """
        self.openapi_types = {
            'context': str,
            'file_length': int,
            'format': str,
            'name': str,
            'theme': str
        }

        self.attribute_map = {
            'context': 'Context',
            'file_length': 'FileLength',
            'format': 'Format',
            'name': 'Name',
            'theme': 'Theme'
        }

        self._context = context
        self._file_length = file_length
        self._format = format
        self._name = name
        self._theme = theme

    @classmethod
    def from_dict(cls, dikt) -> 'ImageByNameInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ImageByNameInfo of this ImageByNameInfo.  # noqa: E501
        :rtype: ImageByNameInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def context(self) -> str:
        """Gets the context of this ImageByNameInfo.

        Gets or sets the context.  # noqa: E501

        :return: The context of this ImageByNameInfo.
        :rtype: str
        """
        return self._context

    @context.setter
    def context(self, context: str):
        """Sets the context of this ImageByNameInfo.

        Gets or sets the context.  # noqa: E501

        :param context: The context of this ImageByNameInfo.
        :type context: str
        """

        self._context = context

    @property
    def file_length(self) -> int:
        """Gets the file_length of this ImageByNameInfo.

        Gets or sets the length of the file.  # noqa: E501

        :return: The file_length of this ImageByNameInfo.
        :rtype: int
        """
        return self._file_length

    @file_length.setter
    def file_length(self, file_length: int):
        """Sets the file_length of this ImageByNameInfo.

        Gets or sets the length of the file.  # noqa: E501

        :param file_length: The file_length of this ImageByNameInfo.
        :type file_length: int
        """

        self._file_length = file_length

    @property
    def format(self) -> str:
        """Gets the format of this ImageByNameInfo.

        Gets or sets the format.  # noqa: E501

        :return: The format of this ImageByNameInfo.
        :rtype: str
        """
        return self._format

    @format.setter
    def format(self, format: str):
        """Sets the format of this ImageByNameInfo.

        Gets or sets the format.  # noqa: E501

        :param format: The format of this ImageByNameInfo.
        :type format: str
        """

        self._format = format

    @property
    def name(self) -> str:
        """Gets the name of this ImageByNameInfo.

        Gets or sets the name.  # noqa: E501

        :return: The name of this ImageByNameInfo.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this ImageByNameInfo.

        Gets or sets the name.  # noqa: E501

        :param name: The name of this ImageByNameInfo.
        :type name: str
        """

        self._name = name

    @property
    def theme(self) -> str:
        """Gets the theme of this ImageByNameInfo.

        Gets or sets the theme.  # noqa: E501

        :return: The theme of this ImageByNameInfo.
        :rtype: str
        """
        return self._theme

    @theme.setter
    def theme(self, theme: str):
        """Sets the theme of this ImageByNameInfo.

        Gets or sets the theme.  # noqa: E501

        :param theme: The theme of this ImageByNameInfo.
        :type theme: str
        """

        self._theme = theme
