from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.category_type import CategoryType
from openapi_server.models.international_return_override_type import InternationalReturnOverrideType
from openapi_server.models.time_duration import TimeDuration
from openapi_server import util

from openapi_server.models.category_type import CategoryType  # noqa: E501
from openapi_server.models.international_return_override_type import InternationalReturnOverrideType  # noqa: E501
from openapi_server.models.time_duration import TimeDuration  # noqa: E501

class ReturnPolicy(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, category_types=None, description=None, extended_holiday_returns_offered=None, international_override=None, marketplace_id=None, name=None, refund_method=None, restocking_fee_percentage=None, return_instructions=None, return_method=None, return_period=None, return_policy_id=None, return_shipping_cost_payer=None, returns_accepted=None):  # noqa: E501
        """ReturnPolicy - a model defined in OpenAPI

        :param category_types: The category_types of this ReturnPolicy.  # noqa: E501
        :type category_types: List[CategoryType]
        :param description: The description of this ReturnPolicy.  # noqa: E501
        :type description: str
        :param extended_holiday_returns_offered: The extended_holiday_returns_offered of this ReturnPolicy.  # noqa: E501
        :type extended_holiday_returns_offered: bool
        :param international_override: The international_override of this ReturnPolicy.  # noqa: E501
        :type international_override: InternationalReturnOverrideType
        :param marketplace_id: The marketplace_id of this ReturnPolicy.  # noqa: E501
        :type marketplace_id: str
        :param name: The name of this ReturnPolicy.  # noqa: E501
        :type name: str
        :param refund_method: The refund_method of this ReturnPolicy.  # noqa: E501
        :type refund_method: str
        :param restocking_fee_percentage: The restocking_fee_percentage of this ReturnPolicy.  # noqa: E501
        :type restocking_fee_percentage: str
        :param return_instructions: The return_instructions of this ReturnPolicy.  # noqa: E501
        :type return_instructions: str
        :param return_method: The return_method of this ReturnPolicy.  # noqa: E501
        :type return_method: str
        :param return_period: The return_period of this ReturnPolicy.  # noqa: E501
        :type return_period: TimeDuration
        :param return_policy_id: The return_policy_id of this ReturnPolicy.  # noqa: E501
        :type return_policy_id: str
        :param return_shipping_cost_payer: The return_shipping_cost_payer of this ReturnPolicy.  # noqa: E501
        :type return_shipping_cost_payer: str
        :param returns_accepted: The returns_accepted of this ReturnPolicy.  # noqa: E501
        :type returns_accepted: bool
        """
        self.openapi_types = {
            'category_types': List[CategoryType],
            'description': str,
            'extended_holiday_returns_offered': bool,
            'international_override': InternationalReturnOverrideType,
            'marketplace_id': str,
            'name': str,
            'refund_method': str,
            'restocking_fee_percentage': str,
            'return_instructions': str,
            'return_method': str,
            'return_period': TimeDuration,
            'return_policy_id': str,
            'return_shipping_cost_payer': str,
            'returns_accepted': bool
        }

        self.attribute_map = {
            'category_types': 'categoryTypes',
            'description': 'description',
            'extended_holiday_returns_offered': 'extendedHolidayReturnsOffered',
            'international_override': 'internationalOverride',
            'marketplace_id': 'marketplaceId',
            'name': 'name',
            'refund_method': 'refundMethod',
            'restocking_fee_percentage': 'restockingFeePercentage',
            'return_instructions': 'returnInstructions',
            'return_method': 'returnMethod',
            'return_period': 'returnPeriod',
            'return_policy_id': 'returnPolicyId',
            'return_shipping_cost_payer': 'returnShippingCostPayer',
            'returns_accepted': 'returnsAccepted'
        }

        self._category_types = category_types
        self._description = description
        self._extended_holiday_returns_offered = extended_holiday_returns_offered
        self._international_override = international_override
        self._marketplace_id = marketplace_id
        self._name = name
        self._refund_method = refund_method
        self._restocking_fee_percentage = restocking_fee_percentage
        self._return_instructions = return_instructions
        self._return_method = return_method
        self._return_period = return_period
        self._return_policy_id = return_policy_id
        self._return_shipping_cost_payer = return_shipping_cost_payer
        self._returns_accepted = returns_accepted

    @classmethod
    def from_dict(cls, dikt) -> 'ReturnPolicy':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ReturnPolicy of this ReturnPolicy.  # noqa: E501
        :rtype: ReturnPolicy
        """
        return util.deserialize_model(dikt, cls)

    @property
    def category_types(self) -> List[CategoryType]:
        """Gets the category_types of this ReturnPolicy.

        This container indicates which category group that the return policy applies to.<br/><br/><span class=\"tablenote\"><b>Note</b>: Return business policies are not applicable to motor vehicle listings, so the <b>categoryTypes.name</b> value will always be <code>ALL_EXCLUDING_MOTORS_VEHICLES</code> for return business policies.</span>  # noqa: E501

        :return: The category_types of this ReturnPolicy.
        :rtype: List[CategoryType]
        """
        return self._category_types

    @category_types.setter
    def category_types(self, category_types: List[CategoryType]):
        """Sets the category_types of this ReturnPolicy.

        This container indicates which category group that the return policy applies to.<br/><br/><span class=\"tablenote\"><b>Note</b>: Return business policies are not applicable to motor vehicle listings, so the <b>categoryTypes.name</b> value will always be <code>ALL_EXCLUDING_MOTORS_VEHICLES</code> for return business policies.</span>  # noqa: E501

        :param category_types: The category_types of this ReturnPolicy.
        :type category_types: List[CategoryType]
        """

        self._category_types = category_types

    @property
    def description(self) -> str:
        """Gets the description of this ReturnPolicy.

        A seller-defined description of the return business policy. This description is only for the seller's use, and is not exposed on any eBay pages.  <br/><br/><b>Max length</b>: 250  # noqa: E501

        :return: The description of this ReturnPolicy.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ReturnPolicy.

        A seller-defined description of the return business policy. This description is only for the seller's use, and is not exposed on any eBay pages.  <br/><br/><b>Max length</b>: 250  # noqa: E501

        :param description: The description of this ReturnPolicy.
        :type description: str
        """

        self._description = description

    @property
    def extended_holiday_returns_offered(self) -> bool:
        """Gets the extended_holiday_returns_offered of this ReturnPolicy.

        <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is deprecated, since eBay no longer supports extended holiday returns. Any value supplied in this field is neither read nor returned.</p>   # noqa: E501

        :return: The extended_holiday_returns_offered of this ReturnPolicy.
        :rtype: bool
        """
        return self._extended_holiday_returns_offered

    @extended_holiday_returns_offered.setter
    def extended_holiday_returns_offered(self, extended_holiday_returns_offered: bool):
        """Sets the extended_holiday_returns_offered of this ReturnPolicy.

        <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is deprecated, since eBay no longer supports extended holiday returns. Any value supplied in this field is neither read nor returned.</p>   # noqa: E501

        :param extended_holiday_returns_offered: The extended_holiday_returns_offered of this ReturnPolicy.
        :type extended_holiday_returns_offered: bool
        """

        self._extended_holiday_returns_offered = extended_holiday_returns_offered

    @property
    def international_override(self) -> InternationalReturnOverrideType:
        """Gets the international_override of this ReturnPolicy.


        :return: The international_override of this ReturnPolicy.
        :rtype: InternationalReturnOverrideType
        """
        return self._international_override

    @international_override.setter
    def international_override(self, international_override: InternationalReturnOverrideType):
        """Sets the international_override of this ReturnPolicy.


        :param international_override: The international_override of this ReturnPolicy.
        :type international_override: InternationalReturnOverrideType
        """

        self._international_override = international_override

    @property
    def marketplace_id(self) -> str:
        """Gets the marketplace_id of this ReturnPolicy.

        The ID of the eBay marketplace to which this return business policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>  # noqa: E501

        :return: The marketplace_id of this ReturnPolicy.
        :rtype: str
        """
        return self._marketplace_id

    @marketplace_id.setter
    def marketplace_id(self, marketplace_id: str):
        """Sets the marketplace_id of this ReturnPolicy.

        The ID of the eBay marketplace to which this return business policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>  # noqa: E501

        :param marketplace_id: The marketplace_id of this ReturnPolicy.
        :type marketplace_id: str
        """

        self._marketplace_id = marketplace_id

    @property
    def name(self) -> str:
        """Gets the name of this ReturnPolicy.

        A seller-defined name for this payment business policy. Names must be unique for policies assigned to the same marketplace.<br /><br /><b>Max length:</b> 64  # noqa: E501

        :return: The name of this ReturnPolicy.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this ReturnPolicy.

        A seller-defined name for this payment business policy. Names must be unique for policies assigned to the same marketplace.<br /><br /><b>Max length:</b> 64  # noqa: E501

        :param name: The name of this ReturnPolicy.
        :type name: str
        """

        self._name = name

    @property
    def refund_method(self) -> str:
        """Gets the refund_method of this ReturnPolicy.

        If a seller indicates that they will accept buyer returns, this value will be set to <code>MONEY_BACK</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:RefundMethodEnum'>eBay API documentation</a>  # noqa: E501

        :return: The refund_method of this ReturnPolicy.
        :rtype: str
        """
        return self._refund_method

    @refund_method.setter
    def refund_method(self, refund_method: str):
        """Sets the refund_method of this ReturnPolicy.

        If a seller indicates that they will accept buyer returns, this value will be set to <code>MONEY_BACK</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:RefundMethodEnum'>eBay API documentation</a>  # noqa: E501

        :param refund_method: The refund_method of this ReturnPolicy.
        :type refund_method: str
        """

        self._refund_method = refund_method

    @property
    def restocking_fee_percentage(self) -> str:
        """Gets the restocking_fee_percentage of this ReturnPolicy.

        <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is deprecated, since eBay no longer allows sellers to charge a restocking fee for buyer remorse returns. If this field is included, it is ignored and it is no longer returned.</p>  # noqa: E501

        :return: The restocking_fee_percentage of this ReturnPolicy.
        :rtype: str
        """
        return self._restocking_fee_percentage

    @restocking_fee_percentage.setter
    def restocking_fee_percentage(self, restocking_fee_percentage: str):
        """Sets the restocking_fee_percentage of this ReturnPolicy.

        <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is deprecated, since eBay no longer allows sellers to charge a restocking fee for buyer remorse returns. If this field is included, it is ignored and it is no longer returned.</p>  # noqa: E501

        :param restocking_fee_percentage: The restocking_fee_percentage of this ReturnPolicy.
        :type restocking_fee_percentage: str
        """

        self._restocking_fee_percentage = restocking_fee_percentage

    @property
    def return_instructions(self) -> str:
        """Gets the return_instructions of this ReturnPolicy.

        This text-based field provides more details on seller-specified return instructions. This field is only returned if set for the return business policy. <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is no longer supported on many eBay marketplaces. To see if a marketplace and eBay category does support this field, call <a href=\"/api-docs/sell/metadata/resources/marketplace/methods/getReturnPolicies\">getReturnPolicies</a> method of the <b>Metadata API</b>. Then you will look for the <b>policyDescriptionEnabled</b> field with a value of <code>true</code> for the eBay category.</span></p><br/><b>Max length</b>: 5000 (8000 for DE)  # noqa: E501

        :return: The return_instructions of this ReturnPolicy.
        :rtype: str
        """
        return self._return_instructions

    @return_instructions.setter
    def return_instructions(self, return_instructions: str):
        """Sets the return_instructions of this ReturnPolicy.

        This text-based field provides more details on seller-specified return instructions. This field is only returned if set for the return business policy. <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is no longer supported on many eBay marketplaces. To see if a marketplace and eBay category does support this field, call <a href=\"/api-docs/sell/metadata/resources/marketplace/methods/getReturnPolicies\">getReturnPolicies</a> method of the <b>Metadata API</b>. Then you will look for the <b>policyDescriptionEnabled</b> field with a value of <code>true</code> for the eBay category.</span></p><br/><b>Max length</b>: 5000 (8000 for DE)  # noqa: E501

        :param return_instructions: The return_instructions of this ReturnPolicy.
        :type return_instructions: str
        """

        self._return_instructions = return_instructions

    @property
    def return_method(self) -> str:
        """Gets the return_method of this ReturnPolicy.

        This field is only returned if the seller is willing to offer a replacement item as an alternative to 'Money Back'. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnMethodEnum'>eBay API documentation</a>  # noqa: E501

        :return: The return_method of this ReturnPolicy.
        :rtype: str
        """
        return self._return_method

    @return_method.setter
    def return_method(self, return_method: str):
        """Sets the return_method of this ReturnPolicy.

        This field is only returned if the seller is willing to offer a replacement item as an alternative to 'Money Back'. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnMethodEnum'>eBay API documentation</a>  # noqa: E501

        :param return_method: The return_method of this ReturnPolicy.
        :type return_method: str
        """

        self._return_method = return_method

    @property
    def return_period(self) -> TimeDuration:
        """Gets the return_period of this ReturnPolicy.


        :return: The return_period of this ReturnPolicy.
        :rtype: TimeDuration
        """
        return self._return_period

    @return_period.setter
    def return_period(self, return_period: TimeDuration):
        """Sets the return_period of this ReturnPolicy.


        :param return_period: The return_period of this ReturnPolicy.
        :type return_period: TimeDuration
        """

        self._return_period = return_period

    @property
    def return_policy_id(self) -> str:
        """Gets the return_policy_id of this ReturnPolicy.

        A unique eBay-assigned ID for a return business policy. This ID is generated when the policy is created.  # noqa: E501

        :return: The return_policy_id of this ReturnPolicy.
        :rtype: str
        """
        return self._return_policy_id

    @return_policy_id.setter
    def return_policy_id(self, return_policy_id: str):
        """Sets the return_policy_id of this ReturnPolicy.

        A unique eBay-assigned ID for a return business policy. This ID is generated when the policy is created.  # noqa: E501

        :param return_policy_id: The return_policy_id of this ReturnPolicy.
        :type return_policy_id: str
        """

        self._return_policy_id = return_policy_id

    @property
    def return_shipping_cost_payer(self) -> str:
        """Gets the return_shipping_cost_payer of this ReturnPolicy.

        This field indicates who is responsible for paying for the shipping charges for returned items. The field can be set to either <code>BUYER</code> or <code>SELLER</code>.  <br/><br/>Depending on the return policy and specifics of the return, either the buyer or the seller can be responsible for the return shipping costs. Note that the seller is always responsible for return shipping costs for SNAD-related issues. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnShippingCostPayerEnum'>eBay API documentation</a>  # noqa: E501

        :return: The return_shipping_cost_payer of this ReturnPolicy.
        :rtype: str
        """
        return self._return_shipping_cost_payer

    @return_shipping_cost_payer.setter
    def return_shipping_cost_payer(self, return_shipping_cost_payer: str):
        """Sets the return_shipping_cost_payer of this ReturnPolicy.

        This field indicates who is responsible for paying for the shipping charges for returned items. The field can be set to either <code>BUYER</code> or <code>SELLER</code>.  <br/><br/>Depending on the return policy and specifics of the return, either the buyer or the seller can be responsible for the return shipping costs. Note that the seller is always responsible for return shipping costs for SNAD-related issues. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnShippingCostPayerEnum'>eBay API documentation</a>  # noqa: E501

        :param return_shipping_cost_payer: The return_shipping_cost_payer of this ReturnPolicy.
        :type return_shipping_cost_payer: str
        """

        self._return_shipping_cost_payer = return_shipping_cost_payer

    @property
    def returns_accepted(self) -> bool:
        """Gets the returns_accepted of this ReturnPolicy.

        If this field is returned as <code>true</code>, the seller accepts returns. <br/><br/><span class=\"tablenote\"><strong>Note:</strong>Top-Rated sellers must accept item returns and the <b>handlingTime</b> should be set to zero days or one day for a listing to receive a Top-Rated Plus badge on the View Item or search result pages. For more information on eBay's Top-Rated seller program, see <a href=\"https://pages.ebay.com/help/sell/top-rated.html \">Becoming a Top Rated Seller and qualifying for Top Rated Plus benefits</a>.</span>  # noqa: E501

        :return: The returns_accepted of this ReturnPolicy.
        :rtype: bool
        """
        return self._returns_accepted

    @returns_accepted.setter
    def returns_accepted(self, returns_accepted: bool):
        """Sets the returns_accepted of this ReturnPolicy.

        If this field is returned as <code>true</code>, the seller accepts returns. <br/><br/><span class=\"tablenote\"><strong>Note:</strong>Top-Rated sellers must accept item returns and the <b>handlingTime</b> should be set to zero days or one day for a listing to receive a Top-Rated Plus badge on the View Item or search result pages. For more information on eBay's Top-Rated seller program, see <a href=\"https://pages.ebay.com/help/sell/top-rated.html \">Becoming a Top Rated Seller and qualifying for Top Rated Plus benefits</a>.</span>  # noqa: E501

        :param returns_accepted: The returns_accepted of this ReturnPolicy.
        :type returns_accepted: bool
        """

        self._returns_accepted = returns_accepted
