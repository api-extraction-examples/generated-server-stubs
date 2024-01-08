from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class LogFile(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, date_created=None, date_modified=None, name=None, size=None):  # noqa: E501
        """LogFile - a model defined in OpenAPI

        :param date_created: The date_created of this LogFile.  # noqa: E501
        :type date_created: datetime
        :param date_modified: The date_modified of this LogFile.  # noqa: E501
        :type date_modified: datetime
        :param name: The name of this LogFile.  # noqa: E501
        :type name: str
        :param size: The size of this LogFile.  # noqa: E501
        :type size: int
        """
        self.openapi_types = {
            'date_created': datetime,
            'date_modified': datetime,
            'name': str,
            'size': int
        }

        self.attribute_map = {
            'date_created': 'DateCreated',
            'date_modified': 'DateModified',
            'name': 'Name',
            'size': 'Size'
        }

        self._date_created = date_created
        self._date_modified = date_modified
        self._name = name
        self._size = size

    @classmethod
    def from_dict(cls, dikt) -> 'LogFile':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The LogFile of this LogFile.  # noqa: E501
        :rtype: LogFile
        """
        return util.deserialize_model(dikt, cls)

    @property
    def date_created(self) -> datetime:
        """Gets the date_created of this LogFile.

        Gets or sets the date created.  # noqa: E501

        :return: The date_created of this LogFile.
        :rtype: datetime
        """
        return self._date_created

    @date_created.setter
    def date_created(self, date_created: datetime):
        """Sets the date_created of this LogFile.

        Gets or sets the date created.  # noqa: E501

        :param date_created: The date_created of this LogFile.
        :type date_created: datetime
        """

        self._date_created = date_created

    @property
    def date_modified(self) -> datetime:
        """Gets the date_modified of this LogFile.

        Gets or sets the date modified.  # noqa: E501

        :return: The date_modified of this LogFile.
        :rtype: datetime
        """
        return self._date_modified

    @date_modified.setter
    def date_modified(self, date_modified: datetime):
        """Sets the date_modified of this LogFile.

        Gets or sets the date modified.  # noqa: E501

        :param date_modified: The date_modified of this LogFile.
        :type date_modified: datetime
        """

        self._date_modified = date_modified

    @property
    def name(self) -> str:
        """Gets the name of this LogFile.

        Gets or sets the name.  # noqa: E501

        :return: The name of this LogFile.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this LogFile.

        Gets or sets the name.  # noqa: E501

        :param name: The name of this LogFile.
        :type name: str
        """

        self._name = name

    @property
    def size(self) -> int:
        """Gets the size of this LogFile.

        Gets or sets the size.  # noqa: E501

        :return: The size of this LogFile.
        :rtype: int
        """
        return self._size

    @size.setter
    def size(self, size: int):
        """Sets the size of this LogFile.

        Gets or sets the size.  # noqa: E501

        :param size: The size of this LogFile.
        :type size: int
        """

        self._size = size
