from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class UserCollectionItemRolesInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name=None):  # noqa: E501
        """UserCollectionItemRolesInner - a model defined in OpenAPI

        :param name: The name of this UserCollectionItemRolesInner.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'name': str
        }

        self.attribute_map = {
            'name': 'name'
        }

        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'UserCollectionItemRolesInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UserCollectionItem_roles_inner of this UserCollectionItemRolesInner.  # noqa: E501
        :rtype: UserCollectionItemRolesInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> str:
        """Gets the name of this UserCollectionItemRolesInner.


        :return: The name of this UserCollectionItemRolesInner.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this UserCollectionItemRolesInner.


        :param name: The name of this UserCollectionItemRolesInner.
        :type name: str
        """

        self._name = name
