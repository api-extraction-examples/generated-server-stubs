from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class GetAccountSummaryResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, summary_map=None):  # noqa: E501
        """GetAccountSummaryResponse - a model defined in OpenAPI

        :param summary_map: The summary_map of this GetAccountSummaryResponse.  # noqa: E501
        :type summary_map: Dict
        """
        self.openapi_types = {
            'summary_map': Dict
        }

        self.attribute_map = {
            'summary_map': 'SummaryMap'
        }

        self._summary_map = summary_map

    @classmethod
    def from_dict(cls, dikt) -> 'GetAccountSummaryResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetAccountSummaryResponse of this GetAccountSummaryResponse.  # noqa: E501
        :rtype: GetAccountSummaryResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def summary_map(self) -> Dict:
        """Gets the summary_map of this GetAccountSummaryResponse.


        :return: The summary_map of this GetAccountSummaryResponse.
        :rtype: Dict
        """
        return self._summary_map

    @summary_map.setter
    def summary_map(self, summary_map: Dict):
        """Sets the summary_map of this GetAccountSummaryResponse.


        :param summary_map: The summary_map of this GetAccountSummaryResponse.
        :type summary_map: Dict
        """

        self._summary_map = summary_map
