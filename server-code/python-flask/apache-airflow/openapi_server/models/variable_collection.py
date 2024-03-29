from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.variable_collection_item import VariableCollectionItem
from openapi_server import util

from openapi_server.models.variable_collection_item import VariableCollectionItem  # noqa: E501

class VariableCollection(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, total_entries=None, variables=None):  # noqa: E501
        """VariableCollection - a model defined in OpenAPI

        :param total_entries: The total_entries of this VariableCollection.  # noqa: E501
        :type total_entries: int
        :param variables: The variables of this VariableCollection.  # noqa: E501
        :type variables: List[VariableCollectionItem]
        """
        self.openapi_types = {
            'total_entries': int,
            'variables': List[VariableCollectionItem]
        }

        self.attribute_map = {
            'total_entries': 'total_entries',
            'variables': 'variables'
        }

        self._total_entries = total_entries
        self._variables = variables

    @classmethod
    def from_dict(cls, dikt) -> 'VariableCollection':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The VariableCollection of this VariableCollection.  # noqa: E501
        :rtype: VariableCollection
        """
        return util.deserialize_model(dikt, cls)

    @property
    def total_entries(self) -> int:
        """Gets the total_entries of this VariableCollection.

        Count of total objects in the current result set before pagination parameters (limit, offset) are applied.   # noqa: E501

        :return: The total_entries of this VariableCollection.
        :rtype: int
        """
        return self._total_entries

    @total_entries.setter
    def total_entries(self, total_entries: int):
        """Sets the total_entries of this VariableCollection.

        Count of total objects in the current result set before pagination parameters (limit, offset) are applied.   # noqa: E501

        :param total_entries: The total_entries of this VariableCollection.
        :type total_entries: int
        """

        self._total_entries = total_entries

    @property
    def variables(self) -> List[VariableCollectionItem]:
        """Gets the variables of this VariableCollection.


        :return: The variables of this VariableCollection.
        :rtype: List[VariableCollectionItem]
        """
        return self._variables

    @variables.setter
    def variables(self, variables: List[VariableCollectionItem]):
        """Sets the variables of this VariableCollection.


        :param variables: The variables of this VariableCollection.
        :type variables: List[VariableCollectionItem]
        """

        self._variables = variables
