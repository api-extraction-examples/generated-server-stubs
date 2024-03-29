from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.dataset import Dataset
from openapi_server import util

from openapi_server.models.dataset import Dataset  # noqa: E501

class DatasetCollection(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, total_entries=None, datasets=None):  # noqa: E501
        """DatasetCollection - a model defined in OpenAPI

        :param total_entries: The total_entries of this DatasetCollection.  # noqa: E501
        :type total_entries: int
        :param datasets: The datasets of this DatasetCollection.  # noqa: E501
        :type datasets: List[Dataset]
        """
        self.openapi_types = {
            'total_entries': int,
            'datasets': List[Dataset]
        }

        self.attribute_map = {
            'total_entries': 'total_entries',
            'datasets': 'datasets'
        }

        self._total_entries = total_entries
        self._datasets = datasets

    @classmethod
    def from_dict(cls, dikt) -> 'DatasetCollection':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DatasetCollection of this DatasetCollection.  # noqa: E501
        :rtype: DatasetCollection
        """
        return util.deserialize_model(dikt, cls)

    @property
    def total_entries(self) -> int:
        """Gets the total_entries of this DatasetCollection.

        Count of total objects in the current result set before pagination parameters (limit, offset) are applied.   # noqa: E501

        :return: The total_entries of this DatasetCollection.
        :rtype: int
        """
        return self._total_entries

    @total_entries.setter
    def total_entries(self, total_entries: int):
        """Sets the total_entries of this DatasetCollection.

        Count of total objects in the current result set before pagination parameters (limit, offset) are applied.   # noqa: E501

        :param total_entries: The total_entries of this DatasetCollection.
        :type total_entries: int
        """

        self._total_entries = total_entries

    @property
    def datasets(self) -> List[Dataset]:
        """Gets the datasets of this DatasetCollection.


        :return: The datasets of this DatasetCollection.
        :rtype: List[Dataset]
        """
        return self._datasets

    @datasets.setter
    def datasets(self, datasets: List[Dataset]):
        """Sets the datasets of this DatasetCollection.


        :param datasets: The datasets of this DatasetCollection.
        :type datasets: List[Dataset]
        """

        self._datasets = datasets
