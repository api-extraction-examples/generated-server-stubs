from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.sort_key_type import SortKeyType
from openapi_server import util

from openapi_server.models.sort_key_type import SortKeyType  # noqa: E501

class GetOrganizationsAccessReportRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, job_id=None, max_items=None, marker=None, sort_key=None):  # noqa: E501
        """GetOrganizationsAccessReportRequest - a model defined in OpenAPI

        :param job_id: The job_id of this GetOrganizationsAccessReportRequest.  # noqa: E501
        :type job_id: str
        :param max_items: The max_items of this GetOrganizationsAccessReportRequest.  # noqa: E501
        :type max_items: int
        :param marker: The marker of this GetOrganizationsAccessReportRequest.  # noqa: E501
        :type marker: str
        :param sort_key: The sort_key of this GetOrganizationsAccessReportRequest.  # noqa: E501
        :type sort_key: SortKeyType
        """
        self.openapi_types = {
            'job_id': str,
            'max_items': int,
            'marker': str,
            'sort_key': SortKeyType
        }

        self.attribute_map = {
            'job_id': 'JobId',
            'max_items': 'MaxItems',
            'marker': 'Marker',
            'sort_key': 'SortKey'
        }

        self._job_id = job_id
        self._max_items = max_items
        self._marker = marker
        self._sort_key = sort_key

    @classmethod
    def from_dict(cls, dikt) -> 'GetOrganizationsAccessReportRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetOrganizationsAccessReportRequest of this GetOrganizationsAccessReportRequest.  # noqa: E501
        :rtype: GetOrganizationsAccessReportRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def job_id(self) -> str:
        """Gets the job_id of this GetOrganizationsAccessReportRequest.


        :return: The job_id of this GetOrganizationsAccessReportRequest.
        :rtype: str
        """
        return self._job_id

    @job_id.setter
    def job_id(self, job_id: str):
        """Sets the job_id of this GetOrganizationsAccessReportRequest.


        :param job_id: The job_id of this GetOrganizationsAccessReportRequest.
        :type job_id: str
        """
        if job_id is None:
            raise ValueError("Invalid value for `job_id`, must not be `None`")  # noqa: E501

        self._job_id = job_id

    @property
    def max_items(self) -> int:
        """Gets the max_items of this GetOrganizationsAccessReportRequest.


        :return: The max_items of this GetOrganizationsAccessReportRequest.
        :rtype: int
        """
        return self._max_items

    @max_items.setter
    def max_items(self, max_items: int):
        """Sets the max_items of this GetOrganizationsAccessReportRequest.


        :param max_items: The max_items of this GetOrganizationsAccessReportRequest.
        :type max_items: int
        """

        self._max_items = max_items

    @property
    def marker(self) -> str:
        """Gets the marker of this GetOrganizationsAccessReportRequest.


        :return: The marker of this GetOrganizationsAccessReportRequest.
        :rtype: str
        """
        return self._marker

    @marker.setter
    def marker(self, marker: str):
        """Sets the marker of this GetOrganizationsAccessReportRequest.


        :param marker: The marker of this GetOrganizationsAccessReportRequest.
        :type marker: str
        """

        self._marker = marker

    @property
    def sort_key(self) -> SortKeyType:
        """Gets the sort_key of this GetOrganizationsAccessReportRequest.


        :return: The sort_key of this GetOrganizationsAccessReportRequest.
        :rtype: SortKeyType
        """
        return self._sort_key

    @sort_key.setter
    def sort_key(self, sort_key: SortKeyType):
        """Sets the sort_key of this GetOrganizationsAccessReportRequest.


        :param sort_key: The sort_key of this GetOrganizationsAccessReportRequest.
        :type sort_key: SortKeyType
        """

        self._sort_key = sort_key
