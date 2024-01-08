from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Meta3(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, column_id=None, column_name=None, data_length=None, data_type=None, description=None, object_name=None):  # noqa: E501
        """Meta3 - a model defined in OpenAPI

        :param column_id: The column_id of this Meta3.  # noqa: E501
        :type column_id: str
        :param column_name: The column_name of this Meta3.  # noqa: E501
        :type column_name: str
        :param data_length: The data_length of this Meta3.  # noqa: E501
        :type data_length: str
        :param data_type: The data_type of this Meta3.  # noqa: E501
        :type data_type: str
        :param description: The description of this Meta3.  # noqa: E501
        :type description: str
        :param object_name: The object_name of this Meta3.  # noqa: E501
        :type object_name: str
        """
        self.openapi_types = {
            'column_id': str,
            'column_name': str,
            'data_length': str,
            'data_type': str,
            'description': str,
            'object_name': str
        }

        self.attribute_map = {
            'column_id': 'ColumnID',
            'column_name': 'ColumnName',
            'data_length': 'DataLength',
            'data_type': 'DataType',
            'description': 'Description',
            'object_name': 'ObjectName'
        }

        self._column_id = column_id
        self._column_name = column_name
        self._data_length = data_length
        self._data_type = data_type
        self._description = description
        self._object_name = object_name

    @classmethod
    def from_dict(cls, dikt) -> 'Meta3':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The meta3 of this Meta3.  # noqa: E501
        :rtype: Meta3
        """
        return util.deserialize_model(dikt, cls)

    @property
    def column_id(self) -> str:
        """Gets the column_id of this Meta3.


        :return: The column_id of this Meta3.
        :rtype: str
        """
        return self._column_id

    @column_id.setter
    def column_id(self, column_id: str):
        """Sets the column_id of this Meta3.


        :param column_id: The column_id of this Meta3.
        :type column_id: str
        """
        if column_id is None:
            raise ValueError("Invalid value for `column_id`, must not be `None`")  # noqa: E501

        self._column_id = column_id

    @property
    def column_name(self) -> str:
        """Gets the column_name of this Meta3.


        :return: The column_name of this Meta3.
        :rtype: str
        """
        return self._column_name

    @column_name.setter
    def column_name(self, column_name: str):
        """Sets the column_name of this Meta3.


        :param column_name: The column_name of this Meta3.
        :type column_name: str
        """
        if column_name is None:
            raise ValueError("Invalid value for `column_name`, must not be `None`")  # noqa: E501

        self._column_name = column_name

    @property
    def data_length(self) -> str:
        """Gets the data_length of this Meta3.

        Data length for EPA program database column.  # noqa: E501

        :return: The data_length of this Meta3.
        :rtype: str
        """
        return self._data_length

    @data_length.setter
    def data_length(self, data_length: str):
        """Sets the data_length of this Meta3.

        Data length for EPA program database column.  # noqa: E501

        :param data_length: The data_length of this Meta3.
        :type data_length: str
        """
        if data_length is None:
            raise ValueError("Invalid value for `data_length`, must not be `None`")  # noqa: E501

        self._data_length = data_length

    @property
    def data_type(self) -> str:
        """Gets the data_type of this Meta3.

        Data type for EPA program database column.  # noqa: E501

        :return: The data_type of this Meta3.
        :rtype: str
        """
        return self._data_type

    @data_type.setter
    def data_type(self, data_type: str):
        """Sets the data_type of this Meta3.

        Data type for EPA program database column.  # noqa: E501

        :param data_type: The data_type of this Meta3.
        :type data_type: str
        """
        if data_type is None:
            raise ValueError("Invalid value for `data_type`, must not be `None`")  # noqa: E501

        self._data_type = data_type

    @property
    def description(self) -> str:
        """Gets the description of this Meta3.


        :return: The description of this Meta3.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this Meta3.


        :param description: The description of this Meta3.
        :type description: str
        """
        if description is None:
            raise ValueError("Invalid value for `description`, must not be `None`")  # noqa: E501

        self._description = description

    @property
    def object_name(self) -> str:
        """Gets the object_name of this Meta3.

        The JSON name used for the database column.  # noqa: E501

        :return: The object_name of this Meta3.
        :rtype: str
        """
        return self._object_name

    @object_name.setter
    def object_name(self, object_name: str):
        """Sets the object_name of this Meta3.

        The JSON name used for the database column.  # noqa: E501

        :param object_name: The object_name of this Meta3.
        :type object_name: str
        """
        if object_name is None:
            raise ValueError("Invalid value for `object_name`, must not be `None`")  # noqa: E501

        self._object_name = object_name
