from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.amount import Amount
from openapi_server.models.shipping_service import ShippingService
from openapi_server import util

from openapi_server.models.amount import Amount  # noqa: E501
from openapi_server.models.shipping_service import ShippingService  # noqa: E501

class ShippingOption(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, cost_type=None, insurance_fee=None, insurance_offered=None, option_type=None, package_handling_cost=None, rate_table_id=None, shipping_discount_profile_id=None, shipping_promotion_offered=None, shipping_services=None):  # noqa: E501
        """ShippingOption - a model defined in OpenAPI

        :param cost_type: The cost_type of this ShippingOption.  # noqa: E501
        :type cost_type: str
        :param insurance_fee: The insurance_fee of this ShippingOption.  # noqa: E501
        :type insurance_fee: Amount
        :param insurance_offered: The insurance_offered of this ShippingOption.  # noqa: E501
        :type insurance_offered: bool
        :param option_type: The option_type of this ShippingOption.  # noqa: E501
        :type option_type: str
        :param package_handling_cost: The package_handling_cost of this ShippingOption.  # noqa: E501
        :type package_handling_cost: Amount
        :param rate_table_id: The rate_table_id of this ShippingOption.  # noqa: E501
        :type rate_table_id: str
        :param shipping_discount_profile_id: The shipping_discount_profile_id of this ShippingOption.  # noqa: E501
        :type shipping_discount_profile_id: str
        :param shipping_promotion_offered: The shipping_promotion_offered of this ShippingOption.  # noqa: E501
        :type shipping_promotion_offered: bool
        :param shipping_services: The shipping_services of this ShippingOption.  # noqa: E501
        :type shipping_services: List[ShippingService]
        """
        self.openapi_types = {
            'cost_type': str,
            'insurance_fee': Amount,
            'insurance_offered': bool,
            'option_type': str,
            'package_handling_cost': Amount,
            'rate_table_id': str,
            'shipping_discount_profile_id': str,
            'shipping_promotion_offered': bool,
            'shipping_services': List[ShippingService]
        }

        self.attribute_map = {
            'cost_type': 'costType',
            'insurance_fee': 'insuranceFee',
            'insurance_offered': 'insuranceOffered',
            'option_type': 'optionType',
            'package_handling_cost': 'packageHandlingCost',
            'rate_table_id': 'rateTableId',
            'shipping_discount_profile_id': 'shippingDiscountProfileId',
            'shipping_promotion_offered': 'shippingPromotionOffered',
            'shipping_services': 'shippingServices'
        }

        self._cost_type = cost_type
        self._insurance_fee = insurance_fee
        self._insurance_offered = insurance_offered
        self._option_type = option_type
        self._package_handling_cost = package_handling_cost
        self._rate_table_id = rate_table_id
        self._shipping_discount_profile_id = shipping_discount_profile_id
        self._shipping_promotion_offered = shipping_promotion_offered
        self._shipping_services = shipping_services

    @classmethod
    def from_dict(cls, dikt) -> 'ShippingOption':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ShippingOption of this ShippingOption.  # noqa: E501
        :rtype: ShippingOption
        """
        return util.deserialize_model(dikt, cls)

    @property
    def cost_type(self) -> str:
        """Gets the cost_type of this ShippingOption.

        This field defines whether the shipping cost model is <code>FLAT_RATE</code> (the same rate for all buyers, or buyers within a region if shipping rate tables are used) or <code>CALCULATED</code> (the shipping rate varies by the ship-to location and size and weight of the package). <br/><br/>This field is conditionally required if any shipping service options are specified (domestic and/or international). For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ShippingCostTypeEnum'>eBay API documentation</a>  # noqa: E501

        :return: The cost_type of this ShippingOption.
        :rtype: str
        """
        return self._cost_type

    @cost_type.setter
    def cost_type(self, cost_type: str):
        """Sets the cost_type of this ShippingOption.

        This field defines whether the shipping cost model is <code>FLAT_RATE</code> (the same rate for all buyers, or buyers within a region if shipping rate tables are used) or <code>CALCULATED</code> (the shipping rate varies by the ship-to location and size and weight of the package). <br/><br/>This field is conditionally required if any shipping service options are specified (domestic and/or international). For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ShippingCostTypeEnum'>eBay API documentation</a>  # noqa: E501

        :param cost_type: The cost_type of this ShippingOption.
        :type cost_type: str
        """

        self._cost_type = cost_type

    @property
    def insurance_fee(self) -> Amount:
        """Gets the insurance_fee of this ShippingOption.


        :return: The insurance_fee of this ShippingOption.
        :rtype: Amount
        """
        return self._insurance_fee

    @insurance_fee.setter
    def insurance_fee(self, insurance_fee: Amount):
        """Sets the insurance_fee of this ShippingOption.


        :param insurance_fee: The insurance_fee of this ShippingOption.
        :type insurance_fee: Amount
        """

        self._insurance_fee = insurance_fee

    @property
    def insurance_offered(self) -> bool:
        """Gets the insurance_offered of this ShippingOption.

        This field has been deprecated. <br/><br/>Shipping insurance is offered only via a shipping carrier's shipping services and is no longer available via eBay shipping policies.  # noqa: E501

        :return: The insurance_offered of this ShippingOption.
        :rtype: bool
        """
        return self._insurance_offered

    @insurance_offered.setter
    def insurance_offered(self, insurance_offered: bool):
        """Sets the insurance_offered of this ShippingOption.

        This field has been deprecated. <br/><br/>Shipping insurance is offered only via a shipping carrier's shipping services and is no longer available via eBay shipping policies.  # noqa: E501

        :param insurance_offered: The insurance_offered of this ShippingOption.
        :type insurance_offered: bool
        """

        self._insurance_offered = insurance_offered

    @property
    def option_type(self) -> str:
        """Gets the option_type of this ShippingOption.

        This field is used to indicate if the corresponding shipping service options (under <b>shippingServices</b> array) are domestic or international shipping service options. This field is conditionally required if any shipping service options are specified (domestic and/or international). For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ShippingOptionTypeEnum'>eBay API documentation</a>  # noqa: E501

        :return: The option_type of this ShippingOption.
        :rtype: str
        """
        return self._option_type

    @option_type.setter
    def option_type(self, option_type: str):
        """Sets the option_type of this ShippingOption.

        This field is used to indicate if the corresponding shipping service options (under <b>shippingServices</b> array) are domestic or international shipping service options. This field is conditionally required if any shipping service options are specified (domestic and/or international). For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ShippingOptionTypeEnum'>eBay API documentation</a>  # noqa: E501

        :param option_type: The option_type of this ShippingOption.
        :type option_type: str
        """

        self._option_type = option_type

    @property
    def package_handling_cost(self) -> Amount:
        """Gets the package_handling_cost of this ShippingOption.


        :return: The package_handling_cost of this ShippingOption.
        :rtype: Amount
        """
        return self._package_handling_cost

    @package_handling_cost.setter
    def package_handling_cost(self, package_handling_cost: Amount):
        """Sets the package_handling_cost of this ShippingOption.


        :param package_handling_cost: The package_handling_cost of this ShippingOption.
        :type package_handling_cost: Amount
        """

        self._package_handling_cost = package_handling_cost

    @property
    def rate_table_id(self) -> str:
        """Gets the rate_table_id of this ShippingOption.

        This field is used if the seller wants to associate a domestic or international shipping rate table to the fulfillment business policy. The <a href=\"/api-docs/sell/account/resources/rate_table/methods/getRateTables\">getRateTables</a> method can be used to retrieve shipping rate table IDs.<br/><br/>With domestic and international shipping rate tables, the seller can set different shipping costs based on shipping regions and shipping speed/level of service (one-day, expedited, standard, economy). There are also options to additional per-weight and handling charges.<br/><br/>Sellers need to be careful that shipping rate tables match the corresponding shipping service options. In other words, a domestic shipping rate table must not be specified in the same container where international shipping service options are being specified, and vice versa, and the shipping speed/level of service of the provided shipping service options should match the shipping speed/level of service options that are defined in the shipping rate tables. <br /><br />For example, if the corresponding shipping rate table defines costs for one-day shipping services, there should be at least one one-day shipping service option specified under the <b>shippingServices</b> array.<br/><br/>This field is returned if set.  # noqa: E501

        :return: The rate_table_id of this ShippingOption.
        :rtype: str
        """
        return self._rate_table_id

    @rate_table_id.setter
    def rate_table_id(self, rate_table_id: str):
        """Sets the rate_table_id of this ShippingOption.

        This field is used if the seller wants to associate a domestic or international shipping rate table to the fulfillment business policy. The <a href=\"/api-docs/sell/account/resources/rate_table/methods/getRateTables\">getRateTables</a> method can be used to retrieve shipping rate table IDs.<br/><br/>With domestic and international shipping rate tables, the seller can set different shipping costs based on shipping regions and shipping speed/level of service (one-day, expedited, standard, economy). There are also options to additional per-weight and handling charges.<br/><br/>Sellers need to be careful that shipping rate tables match the corresponding shipping service options. In other words, a domestic shipping rate table must not be specified in the same container where international shipping service options are being specified, and vice versa, and the shipping speed/level of service of the provided shipping service options should match the shipping speed/level of service options that are defined in the shipping rate tables. <br /><br />For example, if the corresponding shipping rate table defines costs for one-day shipping services, there should be at least one one-day shipping service option specified under the <b>shippingServices</b> array.<br/><br/>This field is returned if set.  # noqa: E501

        :param rate_table_id: The rate_table_id of this ShippingOption.
        :type rate_table_id: str
        """

        self._rate_table_id = rate_table_id

    @property
    def shipping_discount_profile_id(self) -> str:
        """Gets the shipping_discount_profile_id of this ShippingOption.

        This field is the unique identifier of a seller's domestic or international shipping discount profile. If a buyer satisfies the requirements of the discount rule, this buyer will receive a shipping discount for the order. <br /><br />The seller can create and manage shipping discount profiles using (Get/Set) <b>ShippingDiscountProfiles</b> calls in the <b>Trading API</b> or through the <b>Shipping Preferences</b> in <b>My eBay</b>. <br/><br/><span class=\"tablenote\"><b>Note: </b>Initially, shipping discount profiles in the <b>Account API</b> will <i>not</i> be available to all sellers.</span>  # noqa: E501

        :return: The shipping_discount_profile_id of this ShippingOption.
        :rtype: str
        """
        return self._shipping_discount_profile_id

    @shipping_discount_profile_id.setter
    def shipping_discount_profile_id(self, shipping_discount_profile_id: str):
        """Sets the shipping_discount_profile_id of this ShippingOption.

        This field is the unique identifier of a seller's domestic or international shipping discount profile. If a buyer satisfies the requirements of the discount rule, this buyer will receive a shipping discount for the order. <br /><br />The seller can create and manage shipping discount profiles using (Get/Set) <b>ShippingDiscountProfiles</b> calls in the <b>Trading API</b> or through the <b>Shipping Preferences</b> in <b>My eBay</b>. <br/><br/><span class=\"tablenote\"><b>Note: </b>Initially, shipping discount profiles in the <b>Account API</b> will <i>not</i> be available to all sellers.</span>  # noqa: E501

        :param shipping_discount_profile_id: The shipping_discount_profile_id of this ShippingOption.
        :type shipping_discount_profile_id: str
        """

        self._shipping_discount_profile_id = shipping_discount_profile_id

    @property
    def shipping_promotion_offered(self) -> bool:
        """Gets the shipping_promotion_offered of this ShippingOption.

        This boolean indicates whether or not the seller has set up a promotional shipping discount that will be available to buyers who satisfy the requirements of the shipping discount rule. <br/><br/>The seller can create and manage shipping promotional discounts using (Get/Set) <b>ShippingDiscountProfiles</b> calls in the <b>Trading API</b> or through the <b>Shipping Preferences</b> in <b>My eBay</b>. <br/><br/><span class=\"tablenote\"><b>Note: </b>Initially, shipping discount profiles in the <b>Account API</b> will <i>not</i> be available to all sellers.</span>  # noqa: E501

        :return: The shipping_promotion_offered of this ShippingOption.
        :rtype: bool
        """
        return self._shipping_promotion_offered

    @shipping_promotion_offered.setter
    def shipping_promotion_offered(self, shipping_promotion_offered: bool):
        """Sets the shipping_promotion_offered of this ShippingOption.

        This boolean indicates whether or not the seller has set up a promotional shipping discount that will be available to buyers who satisfy the requirements of the shipping discount rule. <br/><br/>The seller can create and manage shipping promotional discounts using (Get/Set) <b>ShippingDiscountProfiles</b> calls in the <b>Trading API</b> or through the <b>Shipping Preferences</b> in <b>My eBay</b>. <br/><br/><span class=\"tablenote\"><b>Note: </b>Initially, shipping discount profiles in the <b>Account API</b> will <i>not</i> be available to all sellers.</span>  # noqa: E501

        :param shipping_promotion_offered: The shipping_promotion_offered of this ShippingOption.
        :type shipping_promotion_offered: bool
        """

        self._shipping_promotion_offered = shipping_promotion_offered

    @property
    def shipping_services(self) -> List[ShippingService]:
        """Gets the shipping_services of this ShippingOption.

        This array consists of the domestic or international shipping services options that are defined for the policy. The shipping service options defined under this array should match what is set in the corresponding <b>shippingOptions.optionType</b> field (which controls whether domestic or international shipping service options are being defined). If a shipping rate table is being used, the specified shipping service options should also match the shipping rate table settings (domestic or international, shipping speed/level of service, etc.) <br/><br/>Sellers can specify up to four domestic shipping services and up to five international shipping service options by using separate <b>shippingService</b> containers for each. If the seller is using the Global Shipping Program as an international option, only a total of four international shipping service options (including GSP) can be offered. <br/><br/> See <a href=\"/api-docs/sell/static/seller-accounts/ht_shipping-setting-shipping-carrier-and-service-values.html\" target=\"_blank\">How to set up shipping carrier and shipping service values</a>. <br /><br />To use the eBay standard envelope service (eSE), see <a href=\"/api-docs/sell/static/seller-accounts/using-the-ebay-standard-envelope-service.html\" target=\"_blank\">Using eBay standard envelope (eSE) service</a>.<br /><br />This array is conditionally required if the seller is offering one or more domestic and/or international shipping service options.  # noqa: E501

        :return: The shipping_services of this ShippingOption.
        :rtype: List[ShippingService]
        """
        return self._shipping_services

    @shipping_services.setter
    def shipping_services(self, shipping_services: List[ShippingService]):
        """Sets the shipping_services of this ShippingOption.

        This array consists of the domestic or international shipping services options that are defined for the policy. The shipping service options defined under this array should match what is set in the corresponding <b>shippingOptions.optionType</b> field (which controls whether domestic or international shipping service options are being defined). If a shipping rate table is being used, the specified shipping service options should also match the shipping rate table settings (domestic or international, shipping speed/level of service, etc.) <br/><br/>Sellers can specify up to four domestic shipping services and up to five international shipping service options by using separate <b>shippingService</b> containers for each. If the seller is using the Global Shipping Program as an international option, only a total of four international shipping service options (including GSP) can be offered. <br/><br/> See <a href=\"/api-docs/sell/static/seller-accounts/ht_shipping-setting-shipping-carrier-and-service-values.html\" target=\"_blank\">How to set up shipping carrier and shipping service values</a>. <br /><br />To use the eBay standard envelope service (eSE), see <a href=\"/api-docs/sell/static/seller-accounts/using-the-ebay-standard-envelope-service.html\" target=\"_blank\">Using eBay standard envelope (eSE) service</a>.<br /><br />This array is conditionally required if the seller is offering one or more domestic and/or international shipping service options.  # noqa: E501

        :param shipping_services: The shipping_services of this ShippingOption.
        :type shipping_services: List[ShippingService]
        """

        self._shipping_services = shipping_services
