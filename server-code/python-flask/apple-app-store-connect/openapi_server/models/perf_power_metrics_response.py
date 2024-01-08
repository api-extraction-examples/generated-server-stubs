from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.paged_document_links import PagedDocumentLinks
from openapi_server.models.paging_information import PagingInformation
from openapi_server.models.perf_power_metric import PerfPowerMetric
from openapi_server import util

from openapi_server.models.paged_document_links import PagedDocumentLinks  # noqa: E501
from openapi_server.models.paging_information import PagingInformation  # noqa: E501
from openapi_server.models.perf_power_metric import PerfPowerMetric  # noqa: E501

class PerfPowerMetricsResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None, meta=None):  # noqa: E501
        """PerfPowerMetricsResponse - a model defined in OpenAPI

        :param data: The data of this PerfPowerMetricsResponse.  # noqa: E501
        :type data: List[PerfPowerMetric]
        :param links: The links of this PerfPowerMetricsResponse.  # noqa: E501
        :type links: PagedDocumentLinks
        :param meta: The meta of this PerfPowerMetricsResponse.  # noqa: E501
        :type meta: PagingInformation
        """
        self.openapi_types = {
            'data': List[PerfPowerMetric],
            'links': PagedDocumentLinks,
            'meta': PagingInformation
        }

        self.attribute_map = {
            'data': 'data',
            'links': 'links',
            'meta': 'meta'
        }

        self._data = data
        self._links = links
        self._meta = meta

    @classmethod
    def from_dict(cls, dikt) -> 'PerfPowerMetricsResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PerfPowerMetricsResponse of this PerfPowerMetricsResponse.  # noqa: E501
        :rtype: PerfPowerMetricsResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[PerfPowerMetric]:
        """Gets the data of this PerfPowerMetricsResponse.


        :return: The data of this PerfPowerMetricsResponse.
        :rtype: List[PerfPowerMetric]
        """
        return self._data

    @data.setter
    def data(self, data: List[PerfPowerMetric]):
        """Sets the data of this PerfPowerMetricsResponse.


        :param data: The data of this PerfPowerMetricsResponse.
        :type data: List[PerfPowerMetric]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def links(self) -> PagedDocumentLinks:
        """Gets the links of this PerfPowerMetricsResponse.


        :return: The links of this PerfPowerMetricsResponse.
        :rtype: PagedDocumentLinks
        """
        return self._links

    @links.setter
    def links(self, links: PagedDocumentLinks):
        """Sets the links of this PerfPowerMetricsResponse.


        :param links: The links of this PerfPowerMetricsResponse.
        :type links: PagedDocumentLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def meta(self) -> PagingInformation:
        """Gets the meta of this PerfPowerMetricsResponse.


        :return: The meta of this PerfPowerMetricsResponse.
        :rtype: PagingInformation
        """
        return self._meta

    @meta.setter
    def meta(self, meta: PagingInformation):
        """Sets the meta of this PerfPowerMetricsResponse.


        :param meta: The meta of this PerfPowerMetricsResponse.
        :type meta: PagingInformation
        """

        self._meta = meta