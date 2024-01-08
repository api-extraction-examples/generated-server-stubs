from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.pool import Pool
from openapi_server import util

from openapi_server.models.pool import Pool  # noqa: E501

class PoolCollection(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, total_entries=None, pools=None):  # noqa: E501
        """PoolCollection - a model defined in OpenAPI

        :param total_entries: The total_entries of this PoolCollection.  # noqa: E501
        :type total_entries: int
        :param pools: The pools of this PoolCollection.  # noqa: E501
        :type pools: List[Pool]
        """
        self.openapi_types = {
            'total_entries': int,
            'pools': List[Pool]
        }

        self.attribute_map = {
            'total_entries': 'total_entries',
            'pools': 'pools'
        }

        self._total_entries = total_entries
        self._pools = pools

    @classmethod
    def from_dict(cls, dikt) -> 'PoolCollection':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PoolCollection of this PoolCollection.  # noqa: E501
        :rtype: PoolCollection
        """
        return util.deserialize_model(dikt, cls)

    @property
    def total_entries(self) -> int:
        """Gets the total_entries of this PoolCollection.

        Count of total objects in the current result set before pagination parameters (limit, offset) are applied.   # noqa: E501

        :return: The total_entries of this PoolCollection.
        :rtype: int
        """
        return self._total_entries

    @total_entries.setter
    def total_entries(self, total_entries: int):
        """Sets the total_entries of this PoolCollection.

        Count of total objects in the current result set before pagination parameters (limit, offset) are applied.   # noqa: E501

        :param total_entries: The total_entries of this PoolCollection.
        :type total_entries: int
        """

        self._total_entries = total_entries

    @property
    def pools(self) -> List[Pool]:
        """Gets the pools of this PoolCollection.


        :return: The pools of this PoolCollection.
        :rtype: List[Pool]
        """
        return self._pools

    @pools.setter
    def pools(self, pools: List[Pool]):
        """Sets the pools of this PoolCollection.


        :param pools: The pools of this PoolCollection.
        :type pools: List[Pool]
        """

        self._pools = pools