from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.stream_by_sdk_links import StreamBySDKLinks
from openapi_server.models.stream_usage_series import StreamUsageSeries
from openapi_server import util

from openapi_server.models.stream_by_sdk_links import StreamBySDKLinks  # noqa: E501
from openapi_server.models.stream_usage_series import StreamUsageSeries  # noqa: E501

class MAUbyCategory(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, links=None, metadata=None, series=None):  # noqa: E501
        """MAUbyCategory - a model defined in OpenAPI

        :param links: The links of this MAUbyCategory.  # noqa: E501
        :type links: StreamBySDKLinks
        :param metadata: The metadata of this MAUbyCategory.  # noqa: E501
        :type metadata: List[object]
        :param series: The series of this MAUbyCategory.  # noqa: E501
        :type series: List[StreamUsageSeries]
        """
        self.openapi_types = {
            'links': StreamBySDKLinks,
            'metadata': List[object],
            'series': List[StreamUsageSeries]
        }

        self.attribute_map = {
            'links': '_links',
            'metadata': 'metadata',
            'series': 'series'
        }

        self._links = links
        self._metadata = metadata
        self._series = series

    @classmethod
    def from_dict(cls, dikt) -> 'MAUbyCategory':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MAUbyCategory of this MAUbyCategory.  # noqa: E501
        :rtype: MAUbyCategory
        """
        return util.deserialize_model(dikt, cls)

    @property
    def links(self) -> StreamBySDKLinks:
        """Gets the links of this MAUbyCategory.


        :return: The links of this MAUbyCategory.
        :rtype: StreamBySDKLinks
        """
        return self._links

    @links.setter
    def links(self, links: StreamBySDKLinks):
        """Sets the links of this MAUbyCategory.


        :param links: The links of this MAUbyCategory.
        :type links: StreamBySDKLinks
        """

        self._links = links

    @property
    def metadata(self) -> List[object]:
        """Gets the metadata of this MAUbyCategory.


        :return: The metadata of this MAUbyCategory.
        :rtype: List[object]
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata: List[object]):
        """Sets the metadata of this MAUbyCategory.


        :param metadata: The metadata of this MAUbyCategory.
        :type metadata: List[object]
        """

        self._metadata = metadata

    @property
    def series(self) -> List[StreamUsageSeries]:
        """Gets the series of this MAUbyCategory.


        :return: The series of this MAUbyCategory.
        :rtype: List[StreamUsageSeries]
        """
        return self._series

    @series.setter
    def series(self, series: List[StreamUsageSeries]):
        """Sets the series of this MAUbyCategory.


        :param series: The series of this MAUbyCategory.
        :type series: List[StreamUsageSeries]
        """

        self._series = series
