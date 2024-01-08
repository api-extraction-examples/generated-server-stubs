from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class JqlQueryFieldEntityProperty(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, entity=None, key=None, path=None, type=None):  # noqa: E501
        """JqlQueryFieldEntityProperty - a model defined in OpenAPI

        :param entity: The entity of this JqlQueryFieldEntityProperty.  # noqa: E501
        :type entity: str
        :param key: The key of this JqlQueryFieldEntityProperty.  # noqa: E501
        :type key: str
        :param path: The path of this JqlQueryFieldEntityProperty.  # noqa: E501
        :type path: str
        :param type: The type of this JqlQueryFieldEntityProperty.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'entity': str,
            'key': str,
            'path': str,
            'type': str
        }

        self.attribute_map = {
            'entity': 'entity',
            'key': 'key',
            'path': 'path',
            'type': 'type'
        }

        self._entity = entity
        self._key = key
        self._path = path
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'JqlQueryFieldEntityProperty':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The JqlQueryFieldEntityProperty of this JqlQueryFieldEntityProperty.  # noqa: E501
        :rtype: JqlQueryFieldEntityProperty
        """
        return util.deserialize_model(dikt, cls)

    @property
    def entity(self) -> str:
        """Gets the entity of this JqlQueryFieldEntityProperty.

        The object on which the property is set.  # noqa: E501

        :return: The entity of this JqlQueryFieldEntityProperty.
        :rtype: str
        """
        return self._entity

    @entity.setter
    def entity(self, entity: str):
        """Sets the entity of this JqlQueryFieldEntityProperty.

        The object on which the property is set.  # noqa: E501

        :param entity: The entity of this JqlQueryFieldEntityProperty.
        :type entity: str
        """
        if entity is None:
            raise ValueError("Invalid value for `entity`, must not be `None`")  # noqa: E501

        self._entity = entity

    @property
    def key(self) -> str:
        """Gets the key of this JqlQueryFieldEntityProperty.

        The key of the property.  # noqa: E501

        :return: The key of this JqlQueryFieldEntityProperty.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this JqlQueryFieldEntityProperty.

        The key of the property.  # noqa: E501

        :param key: The key of this JqlQueryFieldEntityProperty.
        :type key: str
        """
        if key is None:
            raise ValueError("Invalid value for `key`, must not be `None`")  # noqa: E501

        self._key = key

    @property
    def path(self) -> str:
        """Gets the path of this JqlQueryFieldEntityProperty.

        The path in the property value to query.  # noqa: E501

        :return: The path of this JqlQueryFieldEntityProperty.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path: str):
        """Sets the path of this JqlQueryFieldEntityProperty.

        The path in the property value to query.  # noqa: E501

        :param path: The path of this JqlQueryFieldEntityProperty.
        :type path: str
        """
        if path is None:
            raise ValueError("Invalid value for `path`, must not be `None`")  # noqa: E501

        self._path = path

    @property
    def type(self) -> str:
        """Gets the type of this JqlQueryFieldEntityProperty.

        The type of the property value extraction. Not available if the extraction for the property is not registered on the instance with the [Entity property](https://developer.atlassian.com/cloud/jira/platform/modules/entity-property/) module.  # noqa: E501

        :return: The type of this JqlQueryFieldEntityProperty.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this JqlQueryFieldEntityProperty.

        The type of the property value extraction. Not available if the extraction for the property is not registered on the instance with the [Entity property](https://developer.atlassian.com/cloud/jira/platform/modules/entity-property/) module.  # noqa: E501

        :param type: The type of this JqlQueryFieldEntityProperty.
        :type type: str
        """
        allowed_values = ["number", "string", "text", "date", "user"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type