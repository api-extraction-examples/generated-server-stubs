from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.worklog import Worklog
from openapi_server import util

from openapi_server.models.worklog import Worklog  # noqa: E501

class PageOfWorklogs(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, max_results=None, start_at=None, total=None, worklogs=None):  # noqa: E501
        """PageOfWorklogs - a model defined in OpenAPI

        :param max_results: The max_results of this PageOfWorklogs.  # noqa: E501
        :type max_results: int
        :param start_at: The start_at of this PageOfWorklogs.  # noqa: E501
        :type start_at: int
        :param total: The total of this PageOfWorklogs.  # noqa: E501
        :type total: int
        :param worklogs: The worklogs of this PageOfWorklogs.  # noqa: E501
        :type worklogs: List[Worklog]
        """
        self.openapi_types = {
            'max_results': int,
            'start_at': int,
            'total': int,
            'worklogs': List[Worklog]
        }

        self.attribute_map = {
            'max_results': 'maxResults',
            'start_at': 'startAt',
            'total': 'total',
            'worklogs': 'worklogs'
        }

        self._max_results = max_results
        self._start_at = start_at
        self._total = total
        self._worklogs = worklogs

    @classmethod
    def from_dict(cls, dikt) -> 'PageOfWorklogs':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PageOfWorklogs of this PageOfWorklogs.  # noqa: E501
        :rtype: PageOfWorklogs
        """
        return util.deserialize_model(dikt, cls)

    @property
    def max_results(self) -> int:
        """Gets the max_results of this PageOfWorklogs.

        The maximum number of results that could be on the page.  # noqa: E501

        :return: The max_results of this PageOfWorklogs.
        :rtype: int
        """
        return self._max_results

    @max_results.setter
    def max_results(self, max_results: int):
        """Sets the max_results of this PageOfWorklogs.

        The maximum number of results that could be on the page.  # noqa: E501

        :param max_results: The max_results of this PageOfWorklogs.
        :type max_results: int
        """

        self._max_results = max_results

    @property
    def start_at(self) -> int:
        """Gets the start_at of this PageOfWorklogs.

        The index of the first item returned on the page.  # noqa: E501

        :return: The start_at of this PageOfWorklogs.
        :rtype: int
        """
        return self._start_at

    @start_at.setter
    def start_at(self, start_at: int):
        """Sets the start_at of this PageOfWorklogs.

        The index of the first item returned on the page.  # noqa: E501

        :param start_at: The start_at of this PageOfWorklogs.
        :type start_at: int
        """

        self._start_at = start_at

    @property
    def total(self) -> int:
        """Gets the total of this PageOfWorklogs.

        The number of results on the page.  # noqa: E501

        :return: The total of this PageOfWorklogs.
        :rtype: int
        """
        return self._total

    @total.setter
    def total(self, total: int):
        """Sets the total of this PageOfWorklogs.

        The number of results on the page.  # noqa: E501

        :param total: The total of this PageOfWorklogs.
        :type total: int
        """

        self._total = total

    @property
    def worklogs(self) -> List[Worklog]:
        """Gets the worklogs of this PageOfWorklogs.

        List of worklogs.  # noqa: E501

        :return: The worklogs of this PageOfWorklogs.
        :rtype: List[Worklog]
        """
        return self._worklogs

    @worklogs.setter
    def worklogs(self, worklogs: List[Worklog]):
        """Sets the worklogs of this PageOfWorklogs.

        List of worklogs.  # noqa: E501

        :param worklogs: The worklogs of this PageOfWorklogs.
        :type worklogs: List[Worklog]
        """

        self._worklogs = worklogs
