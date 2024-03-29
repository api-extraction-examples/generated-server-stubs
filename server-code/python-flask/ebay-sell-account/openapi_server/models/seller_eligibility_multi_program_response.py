from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.seller_eligibility_response import SellerEligibilityResponse
from openapi_server import util

from openapi_server.models.seller_eligibility_response import SellerEligibilityResponse  # noqa: E501

class SellerEligibilityMultiProgramResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, advertising_eligibility=None):  # noqa: E501
        """SellerEligibilityMultiProgramResponse - a model defined in OpenAPI

        :param advertising_eligibility: The advertising_eligibility of this SellerEligibilityMultiProgramResponse.  # noqa: E501
        :type advertising_eligibility: List[SellerEligibilityResponse]
        """
        self.openapi_types = {
            'advertising_eligibility': List[SellerEligibilityResponse]
        }

        self.attribute_map = {
            'advertising_eligibility': 'advertisingEligibility'
        }

        self._advertising_eligibility = advertising_eligibility

    @classmethod
    def from_dict(cls, dikt) -> 'SellerEligibilityMultiProgramResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SellerEligibilityMultiProgramResponse of this SellerEligibilityMultiProgramResponse.  # noqa: E501
        :rtype: SellerEligibilityMultiProgramResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def advertising_eligibility(self) -> List[SellerEligibilityResponse]:
        """Gets the advertising_eligibility of this SellerEligibilityMultiProgramResponse.

        An array of response fields that define the seller eligibility for eBay adverstising programs.  # noqa: E501

        :return: The advertising_eligibility of this SellerEligibilityMultiProgramResponse.
        :rtype: List[SellerEligibilityResponse]
        """
        return self._advertising_eligibility

    @advertising_eligibility.setter
    def advertising_eligibility(self, advertising_eligibility: List[SellerEligibilityResponse]):
        """Sets the advertising_eligibility of this SellerEligibilityMultiProgramResponse.

        An array of response fields that define the seller eligibility for eBay adverstising programs.  # noqa: E501

        :param advertising_eligibility: The advertising_eligibility of this SellerEligibilityMultiProgramResponse.
        :type advertising_eligibility: List[SellerEligibilityResponse]
        """

        self._advertising_eligibility = advertising_eligibility
