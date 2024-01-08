from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.changelog import Changelog
from openapi_server import util

from openapi_server.models.changelog import Changelog  # noqa: E501

class PageOfChangelogs(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, histories=None, max_results=None, start_at=None, total=None):  # noqa: E501
        """PageOfChangelogs - a model defined in OpenAPI

        :param histories: The histories of this PageOfChangelogs.  # noqa: E501
        :type histories: List[Changelog]
        :param max_results: The max_results of this PageOfChangelogs.  # noqa: E501
        :type max_results: int
        :param start_at: The start_at of this PageOfChangelogs.  # noqa: E501
        :type start_at: int
        :param total: The total of this PageOfChangelogs.  # noqa: E501
        :type total: int
        """
        self.openapi_types = {
            'histories': List[Changelog],
            'max_results': int,
            'start_at': int,
            'total': int
        }

        self.attribute_map = {
            'histories': 'histories',
            'max_results': 'maxResults',
            'start_at': 'startAt',
            'total': 'total'
        }

        self._histories = histories
        self._max_results = max_results
        self._start_at = start_at
        self._total = total

    @classmethod
    def from_dict(cls, dikt) -> 'PageOfChangelogs':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PageOfChangelogs of this PageOfChangelogs.  # noqa: E501
        :rtype: PageOfChangelogs
        """
        return util.deserialize_model(dikt, cls)

    @property
    def histories(self) -> List[Changelog]:
        """Gets the histories of this PageOfChangelogs.

        The list of changelogs.  # noqa: E501

        :return: The histories of this PageOfChangelogs.
        :rtype: List[Changelog]
        """
        return self._histories

    @histories.setter
    def histories(self, histories: List[Changelog]):
        """Sets the histories of this PageOfChangelogs.

        The list of changelogs.  # noqa: E501

        :param histories: The histories of this PageOfChangelogs.
        :type histories: List[Changelog]
        """

        self._histories = histories

    @property
    def max_results(self) -> int:
        """Gets the max_results of this PageOfChangelogs.

        The maximum number of results that could be on the page.  # noqa: E501

        :return: The max_results of this PageOfChangelogs.
        :rtype: int
        """
        return self._max_results

    @max_results.setter
    def max_results(self, max_results: int):
        """Sets the max_results of this PageOfChangelogs.

        The maximum number of results that could be on the page.  # noqa: E501

        :param max_results: The max_results of this PageOfChangelogs.
        :type max_results: int
        """

        self._max_results = max_results

    @property
    def start_at(self) -> int:
        """Gets the start_at of this PageOfChangelogs.

        The index of the first item returned on the page.  # noqa: E501

        :return: The start_at of this PageOfChangelogs.
        :rtype: int
        """
        return self._start_at

    @start_at.setter
    def start_at(self, start_at: int):
        """Sets the start_at of this PageOfChangelogs.

        The index of the first item returned on the page.  # noqa: E501

        :param start_at: The start_at of this PageOfChangelogs.
        :type start_at: int
        """

        self._start_at = start_at

    @property
    def total(self) -> int:
        """Gets the total of this PageOfChangelogs.

        The number of results on the page.  # noqa: E501

        :return: The total of this PageOfChangelogs.
        :rtype: int
        """
        return self._total

    @total.setter
    def total(self, total: int):
        """Sets the total of this PageOfChangelogs.

        The number of results on the page.  # noqa: E501

        :param total: The total of this PageOfChangelogs.
        :type total: int
        """

        self._total = total
