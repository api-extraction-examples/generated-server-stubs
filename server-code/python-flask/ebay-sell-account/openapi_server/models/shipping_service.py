from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.amount import Amount
from openapi_server.models.region_set import RegionSet
from openapi_server import util

from openapi_server.models.amount import Amount  # noqa: E501
from openapi_server.models.region_set import RegionSet  # noqa: E501

class ShippingService(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, additional_shipping_cost=None, buyer_responsible_for_pickup=None, buyer_responsible_for_shipping=None, cash_on_delivery_fee=None, free_shipping=None, ship_to_locations=None, shipping_carrier_code=None, shipping_cost=None, shipping_service_code=None, sort_order=None, surcharge=None):  # noqa: E501
        """ShippingService - a model defined in OpenAPI

        :param additional_shipping_cost: The additional_shipping_cost of this ShippingService.  # noqa: E501
        :type additional_shipping_cost: Amount
        :param buyer_responsible_for_pickup: The buyer_responsible_for_pickup of this ShippingService.  # noqa: E501
        :type buyer_responsible_for_pickup: bool
        :param buyer_responsible_for_shipping: The buyer_responsible_for_shipping of this ShippingService.  # noqa: E501
        :type buyer_responsible_for_shipping: bool
        :param cash_on_delivery_fee: The cash_on_delivery_fee of this ShippingService.  # noqa: E501
        :type cash_on_delivery_fee: Amount
        :param free_shipping: The free_shipping of this ShippingService.  # noqa: E501
        :type free_shipping: bool
        :param ship_to_locations: The ship_to_locations of this ShippingService.  # noqa: E501
        :type ship_to_locations: RegionSet
        :param shipping_carrier_code: The shipping_carrier_code of this ShippingService.  # noqa: E501
        :type shipping_carrier_code: str
        :param shipping_cost: The shipping_cost of this ShippingService.  # noqa: E501
        :type shipping_cost: Amount
        :param shipping_service_code: The shipping_service_code of this ShippingService.  # noqa: E501
        :type shipping_service_code: str
        :param sort_order: The sort_order of this ShippingService.  # noqa: E501
        :type sort_order: int
        :param surcharge: The surcharge of this ShippingService.  # noqa: E501
        :type surcharge: Amount
        """
        self.openapi_types = {
            'additional_shipping_cost': Amount,
            'buyer_responsible_for_pickup': bool,
            'buyer_responsible_for_shipping': bool,
            'cash_on_delivery_fee': Amount,
            'free_shipping': bool,
            'ship_to_locations': RegionSet,
            'shipping_carrier_code': str,
            'shipping_cost': Amount,
            'shipping_service_code': str,
            'sort_order': int,
            'surcharge': Amount
        }

        self.attribute_map = {
            'additional_shipping_cost': 'additionalShippingCost',
            'buyer_responsible_for_pickup': 'buyerResponsibleForPickup',
            'buyer_responsible_for_shipping': 'buyerResponsibleForShipping',
            'cash_on_delivery_fee': 'cashOnDeliveryFee',
            'free_shipping': 'freeShipping',
            'ship_to_locations': 'shipToLocations',
            'shipping_carrier_code': 'shippingCarrierCode',
            'shipping_cost': 'shippingCost',
            'shipping_service_code': 'shippingServiceCode',
            'sort_order': 'sortOrder',
            'surcharge': 'surcharge'
        }

        self._additional_shipping_cost = additional_shipping_cost
        self._buyer_responsible_for_pickup = buyer_responsible_for_pickup
        self._buyer_responsible_for_shipping = buyer_responsible_for_shipping
        self._cash_on_delivery_fee = cash_on_delivery_fee
        self._free_shipping = free_shipping
        self._ship_to_locations = ship_to_locations
        self._shipping_carrier_code = shipping_carrier_code
        self._shipping_cost = shipping_cost
        self._shipping_service_code = shipping_service_code
        self._sort_order = sort_order
        self._surcharge = surcharge

    @classmethod
    def from_dict(cls, dikt) -> 'ShippingService':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ShippingService of this ShippingService.  # noqa: E501
        :rtype: ShippingService
        """
        return util.deserialize_model(dikt, cls)

    @property
    def additional_shipping_cost(self) -> Amount:
        """Gets the additional_shipping_cost of this ShippingService.


        :return: The additional_shipping_cost of this ShippingService.
        :rtype: Amount
        """
        return self._additional_shipping_cost

    @additional_shipping_cost.setter
    def additional_shipping_cost(self, additional_shipping_cost: Amount):
        """Sets the additional_shipping_cost of this ShippingService.


        :param additional_shipping_cost: The additional_shipping_cost of this ShippingService.
        :type additional_shipping_cost: Amount
        """

        self._additional_shipping_cost = additional_shipping_cost

    @property
    def buyer_responsible_for_pickup(self) -> bool:
        """Gets the buyer_responsible_for_pickup of this ShippingService.

        This field should be included and set to <code>true</code> for a motor vehicle listing if it will be the buyer's responsibility to pick up the purchased motor vehicle after full payment is made. <br /><br />This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. <br/><br/>This field is returned if set.<br/><br/><b>Default</b>: false  # noqa: E501

        :return: The buyer_responsible_for_pickup of this ShippingService.
        :rtype: bool
        """
        return self._buyer_responsible_for_pickup

    @buyer_responsible_for_pickup.setter
    def buyer_responsible_for_pickup(self, buyer_responsible_for_pickup: bool):
        """Sets the buyer_responsible_for_pickup of this ShippingService.

        This field should be included and set to <code>true</code> for a motor vehicle listing if it will be the buyer's responsibility to pick up the purchased motor vehicle after full payment is made. <br /><br />This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. <br/><br/>This field is returned if set.<br/><br/><b>Default</b>: false  # noqa: E501

        :param buyer_responsible_for_pickup: The buyer_responsible_for_pickup of this ShippingService.
        :type buyer_responsible_for_pickup: bool
        """

        self._buyer_responsible_for_pickup = buyer_responsible_for_pickup

    @property
    def buyer_responsible_for_shipping(self) -> bool:
        """Gets the buyer_responsible_for_shipping of this ShippingService.

        This field should be included and set to <code>true</code> for a motor vehicle listing if it will be the buyer's responsibility to arrange for shipment of a purchased motor vehicle after full payment is made. <br /><br />This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. <br/><br/>This field is returned if set.<br/><br/><b>Default</b>: false  # noqa: E501

        :return: The buyer_responsible_for_shipping of this ShippingService.
        :rtype: bool
        """
        return self._buyer_responsible_for_shipping

    @buyer_responsible_for_shipping.setter
    def buyer_responsible_for_shipping(self, buyer_responsible_for_shipping: bool):
        """Sets the buyer_responsible_for_shipping of this ShippingService.

        This field should be included and set to <code>true</code> for a motor vehicle listing if it will be the buyer's responsibility to arrange for shipment of a purchased motor vehicle after full payment is made. <br /><br />This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. <br/><br/>This field is returned if set.<br/><br/><b>Default</b>: false  # noqa: E501

        :param buyer_responsible_for_shipping: The buyer_responsible_for_shipping of this ShippingService.
        :type buyer_responsible_for_shipping: bool
        """

        self._buyer_responsible_for_shipping = buyer_responsible_for_shipping

    @property
    def cash_on_delivery_fee(self) -> Amount:
        """Gets the cash_on_delivery_fee of this ShippingService.


        :return: The cash_on_delivery_fee of this ShippingService.
        :rtype: Amount
        """
        return self._cash_on_delivery_fee

    @cash_on_delivery_fee.setter
    def cash_on_delivery_fee(self, cash_on_delivery_fee: Amount):
        """Sets the cash_on_delivery_fee of this ShippingService.


        :param cash_on_delivery_fee: The cash_on_delivery_fee of this ShippingService.
        :type cash_on_delivery_fee: Amount
        """

        self._cash_on_delivery_fee = cash_on_delivery_fee

    @property
    def free_shipping(self) -> bool:
        """Gets the free_shipping of this ShippingService.

        This field is included and set to <code>true</code> if the seller offers a free shipping option to the buyer. <br /><br />This field can only be included and set to <code>true</code> for the first domestic shipping service option specified in the <b>shippingServices</b> container (it is ignored if set for subsequent shipping services or for any international shipping service option). <br /><br />The first specified shipping service option has a <b>sortOrder</b> value of <code>1</code> or if the <b>sortOrderId</b> field is not used, it is the shipping service option that's specified first in the <b>shippingServices</b> container.<br/><br/>This container is returned if set.  # noqa: E501

        :return: The free_shipping of this ShippingService.
        :rtype: bool
        """
        return self._free_shipping

    @free_shipping.setter
    def free_shipping(self, free_shipping: bool):
        """Sets the free_shipping of this ShippingService.

        This field is included and set to <code>true</code> if the seller offers a free shipping option to the buyer. <br /><br />This field can only be included and set to <code>true</code> for the first domestic shipping service option specified in the <b>shippingServices</b> container (it is ignored if set for subsequent shipping services or for any international shipping service option). <br /><br />The first specified shipping service option has a <b>sortOrder</b> value of <code>1</code> or if the <b>sortOrderId</b> field is not used, it is the shipping service option that's specified first in the <b>shippingServices</b> container.<br/><br/>This container is returned if set.  # noqa: E501

        :param free_shipping: The free_shipping of this ShippingService.
        :type free_shipping: bool
        """

        self._free_shipping = free_shipping

    @property
    def ship_to_locations(self) -> RegionSet:
        """Gets the ship_to_locations of this ShippingService.


        :return: The ship_to_locations of this ShippingService.
        :rtype: RegionSet
        """
        return self._ship_to_locations

    @ship_to_locations.setter
    def ship_to_locations(self, ship_to_locations: RegionSet):
        """Sets the ship_to_locations of this ShippingService.


        :param ship_to_locations: The ship_to_locations of this ShippingService.
        :type ship_to_locations: RegionSet
        """

        self._ship_to_locations = ship_to_locations

    @property
    def shipping_carrier_code(self) -> str:
        """Gets the shipping_carrier_code of this ShippingService.

        This field sets/indicates the shipping carrier, such as <code>USPS</code>, <code>FedEx</code>, or <code>UPS</code>. Although this field uses the <b>string</b> type, the seller must pass in a pre-defined enumeration value here. <br /><br />For a full list of shipping carrier enum values for a specified eBay marketplace, the <b>GeteBayDetails</b> call of the <b>Trading API</b> can be used, and the <b>DetailName</b> field's value should be set to <code>ShippingCarrierDetails</code>. The enum values for each shipping carriers can be found in each <b>ShippingCarrierDetails.ShippingCarrier</b> field in the response payload.<br/><br/> This field is actually optional, as the shipping carrier is also tied into the <b>shippingServiceCode</b> enum value, and that field is required for every specified shipping service option.<br/><br/>This field is returned if set.  # noqa: E501

        :return: The shipping_carrier_code of this ShippingService.
        :rtype: str
        """
        return self._shipping_carrier_code

    @shipping_carrier_code.setter
    def shipping_carrier_code(self, shipping_carrier_code: str):
        """Sets the shipping_carrier_code of this ShippingService.

        This field sets/indicates the shipping carrier, such as <code>USPS</code>, <code>FedEx</code>, or <code>UPS</code>. Although this field uses the <b>string</b> type, the seller must pass in a pre-defined enumeration value here. <br /><br />For a full list of shipping carrier enum values for a specified eBay marketplace, the <b>GeteBayDetails</b> call of the <b>Trading API</b> can be used, and the <b>DetailName</b> field's value should be set to <code>ShippingCarrierDetails</code>. The enum values for each shipping carriers can be found in each <b>ShippingCarrierDetails.ShippingCarrier</b> field in the response payload.<br/><br/> This field is actually optional, as the shipping carrier is also tied into the <b>shippingServiceCode</b> enum value, and that field is required for every specified shipping service option.<br/><br/>This field is returned if set.  # noqa: E501

        :param shipping_carrier_code: The shipping_carrier_code of this ShippingService.
        :type shipping_carrier_code: str
        """

        self._shipping_carrier_code = shipping_carrier_code

    @property
    def shipping_cost(self) -> Amount:
        """Gets the shipping_cost of this ShippingService.


        :return: The shipping_cost of this ShippingService.
        :rtype: Amount
        """
        return self._shipping_cost

    @shipping_cost.setter
    def shipping_cost(self, shipping_cost: Amount):
        """Sets the shipping_cost of this ShippingService.


        :param shipping_cost: The shipping_cost of this ShippingService.
        :type shipping_cost: Amount
        """

        self._shipping_cost = shipping_cost

    @property
    def shipping_service_code(self) -> str:
        """Gets the shipping_service_code of this ShippingService.

        This field sets/indicates the domestic or international shipping service option, such as <code>USPSPriority</code>, <code>FedEx2Day</code>, or <code>UPS3rdDay</code>. Although this field uses the <b>string</b> type, the seller must pass in a pre-defined enumeration value here. <br /><br />For a full list of shipping service option enum values for a specified eBay marketplace, the <b>GeteBayDetails</b> call of the <b>Trading API</b> can be used, and the <b>DetailName</b> field's value should be set to <code>ShippingServiceDetails</code>. <br /><br />The enum values for each shipping service option can be found in each <b>ShippingServiceDetails.ShippingService</b> field in the response payload. The seller must make sure that the shipping service option is still valid, which is indicated by a <code>true</code> value in the corresponding <b>ValidForSellingFlow</b> boolean field. International shipping service options are typically returned at the top of the response payload, and are indicated by an <b>InternationalService</b> boolean field that reads <code>true</code>. <br /><br />The <b>InternationalService</b> boolean field is not returned at all for domestic shipping service options. <br/><br/> This field is required for every specified shipping service option.<br/><br/>This field is returned if set.  # noqa: E501

        :return: The shipping_service_code of this ShippingService.
        :rtype: str
        """
        return self._shipping_service_code

    @shipping_service_code.setter
    def shipping_service_code(self, shipping_service_code: str):
        """Sets the shipping_service_code of this ShippingService.

        This field sets/indicates the domestic or international shipping service option, such as <code>USPSPriority</code>, <code>FedEx2Day</code>, or <code>UPS3rdDay</code>. Although this field uses the <b>string</b> type, the seller must pass in a pre-defined enumeration value here. <br /><br />For a full list of shipping service option enum values for a specified eBay marketplace, the <b>GeteBayDetails</b> call of the <b>Trading API</b> can be used, and the <b>DetailName</b> field's value should be set to <code>ShippingServiceDetails</code>. <br /><br />The enum values for each shipping service option can be found in each <b>ShippingServiceDetails.ShippingService</b> field in the response payload. The seller must make sure that the shipping service option is still valid, which is indicated by a <code>true</code> value in the corresponding <b>ValidForSellingFlow</b> boolean field. International shipping service options are typically returned at the top of the response payload, and are indicated by an <b>InternationalService</b> boolean field that reads <code>true</code>. <br /><br />The <b>InternationalService</b> boolean field is not returned at all for domestic shipping service options. <br/><br/> This field is required for every specified shipping service option.<br/><br/>This field is returned if set.  # noqa: E501

        :param shipping_service_code: The shipping_service_code of this ShippingService.
        :type shipping_service_code: str
        """

        self._shipping_service_code = shipping_service_code

    @property
    def sort_order(self) -> int:
        """Gets the sort_order of this ShippingService.

        The integer value set in this field controls the order of the corresponding domestic or international shipping service option in the View Item and Checkout pages. <br/><br/>Sellers can specify up to four domestic shipping services (in four separate <b>shippingService</b> containers), so valid values are 1, 2, 3, and 4. A shipping service option with a <b>sortOrder</b> value of <code>1</code> appears at the top of View Item and Checkout pages. Conversely, a shipping service option with a <b>sortOrder</b> value of <code>1</code> appears at the bottom of the list. <br/><br/>Sellers can specify up to five international shipping services (in five separate <b>shippingService</b> containers), so valid values for international shipping services are 1, 2, 3, 4, and 5. Similarly to domestic shipping service options, the <b>sortOrder</b> value of a international shipping service option controls the placement of that shipping service option in the View Item and Checkout pages. <br/><br/>If the <b>sortOrder</b> field is not supplied, the order of domestic and international shipping service options is determined by the order in which they are listed in the API call. <br/><br/><b>Min</b>: 1. <b>Max</b>: 4 (for domestic shipping service) or 5 (for international shipping service).  # noqa: E501

        :return: The sort_order of this ShippingService.
        :rtype: int
        """
        return self._sort_order

    @sort_order.setter
    def sort_order(self, sort_order: int):
        """Sets the sort_order of this ShippingService.

        The integer value set in this field controls the order of the corresponding domestic or international shipping service option in the View Item and Checkout pages. <br/><br/>Sellers can specify up to four domestic shipping services (in four separate <b>shippingService</b> containers), so valid values are 1, 2, 3, and 4. A shipping service option with a <b>sortOrder</b> value of <code>1</code> appears at the top of View Item and Checkout pages. Conversely, a shipping service option with a <b>sortOrder</b> value of <code>1</code> appears at the bottom of the list. <br/><br/>Sellers can specify up to five international shipping services (in five separate <b>shippingService</b> containers), so valid values for international shipping services are 1, 2, 3, 4, and 5. Similarly to domestic shipping service options, the <b>sortOrder</b> value of a international shipping service option controls the placement of that shipping service option in the View Item and Checkout pages. <br/><br/>If the <b>sortOrder</b> field is not supplied, the order of domestic and international shipping service options is determined by the order in which they are listed in the API call. <br/><br/><b>Min</b>: 1. <b>Max</b>: 4 (for domestic shipping service) or 5 (for international shipping service).  # noqa: E501

        :param sort_order: The sort_order of this ShippingService.
        :type sort_order: int
        """

        self._sort_order = sort_order

    @property
    def surcharge(self) -> Amount:
        """Gets the surcharge of this ShippingService.


        :return: The surcharge of this ShippingService.
        :rtype: Amount
        """
        return self._surcharge

    @surcharge.setter
    def surcharge(self, surcharge: Amount):
        """Sets the surcharge of this ShippingService.


        :param surcharge: The surcharge of this ShippingService.
        :type surcharge: Amount
        """

        self._surcharge = surcharge