from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.status_details_status_category import StatusDetailsStatusCategory
from openapi_server import util

from openapi_server.models.status_details_status_category import StatusDetailsStatusCategory  # noqa: E501

class FieldsStatus(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description=None, icon_url=None, id=None, name=None, _self=None, status_category=None):  # noqa: E501
        """FieldsStatus - a model defined in OpenAPI

        :param description: The description of this FieldsStatus.  # noqa: E501
        :type description: str
        :param icon_url: The icon_url of this FieldsStatus.  # noqa: E501
        :type icon_url: str
        :param id: The id of this FieldsStatus.  # noqa: E501
        :type id: str
        :param name: The name of this FieldsStatus.  # noqa: E501
        :type name: str
        :param _self: The _self of this FieldsStatus.  # noqa: E501
        :type _self: str
        :param status_category: The status_category of this FieldsStatus.  # noqa: E501
        :type status_category: StatusDetailsStatusCategory
        """
        self.openapi_types = {
            'description': str,
            'icon_url': str,
            'id': str,
            'name': str,
            '_self': str,
            'status_category': StatusDetailsStatusCategory
        }

        self.attribute_map = {
            'description': 'description',
            'icon_url': 'iconUrl',
            'id': 'id',
            'name': 'name',
            '_self': 'self',
            'status_category': 'statusCategory'
        }

        self._description = description
        self._icon_url = icon_url
        self._id = id
        self._name = name
        self.__self = _self
        self._status_category = status_category

    @classmethod
    def from_dict(cls, dikt) -> 'FieldsStatus':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Fields_status of this FieldsStatus.  # noqa: E501
        :rtype: FieldsStatus
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this FieldsStatus.

        The description of the status.  # noqa: E501

        :return: The description of this FieldsStatus.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this FieldsStatus.

        The description of the status.  # noqa: E501

        :param description: The description of this FieldsStatus.
        :type description: str
        """

        self._description = description

    @property
    def icon_url(self) -> str:
        """Gets the icon_url of this FieldsStatus.

        The URL of the icon used to represent the status.  # noqa: E501

        :return: The icon_url of this FieldsStatus.
        :rtype: str
        """
        return self._icon_url

    @icon_url.setter
    def icon_url(self, icon_url: str):
        """Sets the icon_url of this FieldsStatus.

        The URL of the icon used to represent the status.  # noqa: E501

        :param icon_url: The icon_url of this FieldsStatus.
        :type icon_url: str
        """

        self._icon_url = icon_url

    @property
    def id(self) -> str:
        """Gets the id of this FieldsStatus.

        The ID of the status.  # noqa: E501

        :return: The id of this FieldsStatus.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this FieldsStatus.

        The ID of the status.  # noqa: E501

        :param id: The id of this FieldsStatus.
        :type id: str
        """

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this FieldsStatus.

        The name of the status.  # noqa: E501

        :return: The name of this FieldsStatus.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this FieldsStatus.

        The name of the status.  # noqa: E501

        :param name: The name of this FieldsStatus.
        :type name: str
        """

        self._name = name

    @property
    def _self(self) -> str:
        """Gets the _self of this FieldsStatus.

        The URL of the status.  # noqa: E501

        :return: The _self of this FieldsStatus.
        :rtype: str
        """
        return self.__self

    @_self.setter
    def _self(self, _self: str):
        """Sets the _self of this FieldsStatus.

        The URL of the status.  # noqa: E501

        :param _self: The _self of this FieldsStatus.
        :type _self: str
        """

        self.__self = _self

    @property
    def status_category(self) -> StatusDetailsStatusCategory:
        """Gets the status_category of this FieldsStatus.


        :return: The status_category of this FieldsStatus.
        :rtype: StatusDetailsStatusCategory
        """
        return self._status_category

    @status_category.setter
    def status_category(self, status_category: StatusDetailsStatusCategory):
        """Sets the status_category of this FieldsStatus.


        :param status_category: The status_category of this FieldsStatus.
        :type status_category: StatusDetailsStatusCategory
        """

        self._status_category = status_category
