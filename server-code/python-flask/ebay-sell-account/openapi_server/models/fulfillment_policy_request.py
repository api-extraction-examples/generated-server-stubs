from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.category_type import CategoryType
from openapi_server.models.region_set import RegionSet
from openapi_server.models.shipping_option import ShippingOption
from openapi_server.models.time_duration import TimeDuration
from openapi_server import util

from openapi_server.models.category_type import CategoryType  # noqa: E501
from openapi_server.models.region_set import RegionSet  # noqa: E501
from openapi_server.models.shipping_option import ShippingOption  # noqa: E501
from openapi_server.models.time_duration import TimeDuration  # noqa: E501

class FulfillmentPolicyRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, category_types=None, description=None, freight_shipping=None, global_shipping=None, handling_time=None, local_pickup=None, marketplace_id=None, name=None, pickup_drop_off=None, ship_to_locations=None, shipping_options=None):  # noqa: E501
        """FulfillmentPolicyRequest - a model defined in OpenAPI

        :param category_types: The category_types of this FulfillmentPolicyRequest.  # noqa: E501
        :type category_types: List[CategoryType]
        :param description: The description of this FulfillmentPolicyRequest.  # noqa: E501
        :type description: str
        :param freight_shipping: The freight_shipping of this FulfillmentPolicyRequest.  # noqa: E501
        :type freight_shipping: bool
        :param global_shipping: The global_shipping of this FulfillmentPolicyRequest.  # noqa: E501
        :type global_shipping: bool
        :param handling_time: The handling_time of this FulfillmentPolicyRequest.  # noqa: E501
        :type handling_time: TimeDuration
        :param local_pickup: The local_pickup of this FulfillmentPolicyRequest.  # noqa: E501
        :type local_pickup: bool
        :param marketplace_id: The marketplace_id of this FulfillmentPolicyRequest.  # noqa: E501
        :type marketplace_id: str
        :param name: The name of this FulfillmentPolicyRequest.  # noqa: E501
        :type name: str
        :param pickup_drop_off: The pickup_drop_off of this FulfillmentPolicyRequest.  # noqa: E501
        :type pickup_drop_off: bool
        :param ship_to_locations: The ship_to_locations of this FulfillmentPolicyRequest.  # noqa: E501
        :type ship_to_locations: RegionSet
        :param shipping_options: The shipping_options of this FulfillmentPolicyRequest.  # noqa: E501
        :type shipping_options: List[ShippingOption]
        """
        self.openapi_types = {
            'category_types': List[CategoryType],
            'description': str,
            'freight_shipping': bool,
            'global_shipping': bool,
            'handling_time': TimeDuration,
            'local_pickup': bool,
            'marketplace_id': str,
            'name': str,
            'pickup_drop_off': bool,
            'ship_to_locations': RegionSet,
            'shipping_options': List[ShippingOption]
        }

        self.attribute_map = {
            'category_types': 'categoryTypes',
            'description': 'description',
            'freight_shipping': 'freightShipping',
            'global_shipping': 'globalShipping',
            'handling_time': 'handlingTime',
            'local_pickup': 'localPickup',
            'marketplace_id': 'marketplaceId',
            'name': 'name',
            'pickup_drop_off': 'pickupDropOff',
            'ship_to_locations': 'shipToLocations',
            'shipping_options': 'shippingOptions'
        }

        self._category_types = category_types
        self._description = description
        self._freight_shipping = freight_shipping
        self._global_shipping = global_shipping
        self._handling_time = handling_time
        self._local_pickup = local_pickup
        self._marketplace_id = marketplace_id
        self._name = name
        self._pickup_drop_off = pickup_drop_off
        self._ship_to_locations = ship_to_locations
        self._shipping_options = shipping_options

    @classmethod
    def from_dict(cls, dikt) -> 'FulfillmentPolicyRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FulfillmentPolicyRequest of this FulfillmentPolicyRequest.  # noqa: E501
        :rtype: FulfillmentPolicyRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def category_types(self) -> List[CategoryType]:
        """Gets the category_types of this FulfillmentPolicyRequest.

        This container is used to specify whether the fulfillment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.  # noqa: E501

        :return: The category_types of this FulfillmentPolicyRequest.
        :rtype: List[CategoryType]
        """
        return self._category_types

    @category_types.setter
    def category_types(self, category_types: List[CategoryType]):
        """Sets the category_types of this FulfillmentPolicyRequest.

        This container is used to specify whether the fulfillment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.  # noqa: E501

        :param category_types: The category_types of this FulfillmentPolicyRequest.
        :type category_types: List[CategoryType]
        """

        self._category_types = category_types

    @property
    def description(self) -> str:
        """Gets the description of this FulfillmentPolicyRequest.

        A seller-defined description of the fulfillment policy. This description is only for the seller's use, and is not exposed on any eBay pages.  <br/><br/><b>Max length</b>: 250  # noqa: E501

        :return: The description of this FulfillmentPolicyRequest.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this FulfillmentPolicyRequest.

        A seller-defined description of the fulfillment policy. This description is only for the seller's use, and is not exposed on any eBay pages.  <br/><br/><b>Max length</b>: 250  # noqa: E501

        :param description: The description of this FulfillmentPolicyRequest.
        :type description: str
        """

        self._description = description

    @property
    def freight_shipping(self) -> bool:
        """Gets the freight_shipping of this FulfillmentPolicyRequest.

        This field is included and set to <code>true</code> if freight shipping is available for the item. Freight shipping can be used for large items over 150 lbs.<br/><br/><b>Default</b>: false  # noqa: E501

        :return: The freight_shipping of this FulfillmentPolicyRequest.
        :rtype: bool
        """
        return self._freight_shipping

    @freight_shipping.setter
    def freight_shipping(self, freight_shipping: bool):
        """Sets the freight_shipping of this FulfillmentPolicyRequest.

        This field is included and set to <code>true</code> if freight shipping is available for the item. Freight shipping can be used for large items over 150 lbs.<br/><br/><b>Default</b>: false  # noqa: E501

        :param freight_shipping: The freight_shipping of this FulfillmentPolicyRequest.
        :type freight_shipping: bool
        """

        self._freight_shipping = freight_shipping

    @property
    def global_shipping(self) -> bool:
        """Gets the global_shipping of this FulfillmentPolicyRequest.

        This field is included and set to <code>true</code> if the seller wants to use the Global Shipping Program for international shipments. See the <a href=\"https://pages.ebay.com/help/sell/shipping-globally.html \">Global Shipping Program</a> help topic for more details and requirements on the Global Shipping Program.<br/><br/>It is possible for a seller to use a combination of the Global Shipping Program and other international shipping services. <br/><br/>If this value is set to <code>false</code> or if the field is omitted, the seller is responsible for manually specifying individual international shipping services (if the seller ships internationally)., as described in <a href=\"https://developer.ebay.com/api-docs/sell/static/seller-accounts/ht_shipping-worldwide.html \">Setting up worldwide shipping</a>. <br/><br/>Sellers can opt in or out of the Global Shipping Program through the Shipping preferences in My eBay.<br /><br /><span class=\"tablenote\"><b>Note</b>: On the US marketplace, the <em><b>Global Shipping Program</b></em> is scheduled to be replaced by a new intermediated international shipping program called <em><b>eBay International Shipping</b></em>. US sellers who are opted in to the Global Shipping Program will be automatically opted in to eBay International Shipping when it becomes available to them. All US sellers will be migrated by March 31, 2023. <br /><br />eBay International Shipping is an account level setting, and no field needs to be set in a Fulfillment business policy to enable it. As long as the US seller's account is opted in to eBay International Shipping, this shipping option will be enabled automatically for all listings where international shipping is available. <br /><br />A US seller who is opted in to eBay International Shipping can also specify individual international shipping service options for a Fulfillment business policy.</span><p><b>Default</b>: false</p>  # noqa: E501

        :return: The global_shipping of this FulfillmentPolicyRequest.
        :rtype: bool
        """
        return self._global_shipping

    @global_shipping.setter
    def global_shipping(self, global_shipping: bool):
        """Sets the global_shipping of this FulfillmentPolicyRequest.

        This field is included and set to <code>true</code> if the seller wants to use the Global Shipping Program for international shipments. See the <a href=\"https://pages.ebay.com/help/sell/shipping-globally.html \">Global Shipping Program</a> help topic for more details and requirements on the Global Shipping Program.<br/><br/>It is possible for a seller to use a combination of the Global Shipping Program and other international shipping services. <br/><br/>If this value is set to <code>false</code> or if the field is omitted, the seller is responsible for manually specifying individual international shipping services (if the seller ships internationally)., as described in <a href=\"https://developer.ebay.com/api-docs/sell/static/seller-accounts/ht_shipping-worldwide.html \">Setting up worldwide shipping</a>. <br/><br/>Sellers can opt in or out of the Global Shipping Program through the Shipping preferences in My eBay.<br /><br /><span class=\"tablenote\"><b>Note</b>: On the US marketplace, the <em><b>Global Shipping Program</b></em> is scheduled to be replaced by a new intermediated international shipping program called <em><b>eBay International Shipping</b></em>. US sellers who are opted in to the Global Shipping Program will be automatically opted in to eBay International Shipping when it becomes available to them. All US sellers will be migrated by March 31, 2023. <br /><br />eBay International Shipping is an account level setting, and no field needs to be set in a Fulfillment business policy to enable it. As long as the US seller's account is opted in to eBay International Shipping, this shipping option will be enabled automatically for all listings where international shipping is available. <br /><br />A US seller who is opted in to eBay International Shipping can also specify individual international shipping service options for a Fulfillment business policy.</span><p><b>Default</b>: false</p>  # noqa: E501

        :param global_shipping: The global_shipping of this FulfillmentPolicyRequest.
        :type global_shipping: bool
        """

        self._global_shipping = global_shipping

    @property
    def handling_time(self) -> TimeDuration:
        """Gets the handling_time of this FulfillmentPolicyRequest.


        :return: The handling_time of this FulfillmentPolicyRequest.
        :rtype: TimeDuration
        """
        return self._handling_time

    @handling_time.setter
    def handling_time(self, handling_time: TimeDuration):
        """Sets the handling_time of this FulfillmentPolicyRequest.


        :param handling_time: The handling_time of this FulfillmentPolicyRequest.
        :type handling_time: TimeDuration
        """

        self._handling_time = handling_time

    @property
    def local_pickup(self) -> bool:
        """Gets the local_pickup of this FulfillmentPolicyRequest.

        This field should be included and set to <code>true</code> if local pickup is one of the fulfillment options available to the buyer. It is possible for the seller to make local pickup and some shipping service options available to the buyer.<br/><br/>With local pickup, the buyer and seller make arrangements for pickup time and location.<br/><br/><b>Default</b>: <code>false</code>  # noqa: E501

        :return: The local_pickup of this FulfillmentPolicyRequest.
        :rtype: bool
        """
        return self._local_pickup

    @local_pickup.setter
    def local_pickup(self, local_pickup: bool):
        """Sets the local_pickup of this FulfillmentPolicyRequest.

        This field should be included and set to <code>true</code> if local pickup is one of the fulfillment options available to the buyer. It is possible for the seller to make local pickup and some shipping service options available to the buyer.<br/><br/>With local pickup, the buyer and seller make arrangements for pickup time and location.<br/><br/><b>Default</b>: <code>false</code>  # noqa: E501

        :param local_pickup: The local_pickup of this FulfillmentPolicyRequest.
        :type local_pickup: bool
        """

        self._local_pickup = local_pickup

    @property
    def marketplace_id(self) -> str:
        """Gets the marketplace_id of this FulfillmentPolicyRequest.

        The ID of the eBay marketplace to which this fulfillment policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>  # noqa: E501

        :return: The marketplace_id of this FulfillmentPolicyRequest.
        :rtype: str
        """
        return self._marketplace_id

    @marketplace_id.setter
    def marketplace_id(self, marketplace_id: str):
        """Sets the marketplace_id of this FulfillmentPolicyRequest.

        The ID of the eBay marketplace to which this fulfillment policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>  # noqa: E501

        :param marketplace_id: The marketplace_id of this FulfillmentPolicyRequest.
        :type marketplace_id: str
        """

        self._marketplace_id = marketplace_id

    @property
    def name(self) -> str:
        """Gets the name of this FulfillmentPolicyRequest.

        A seller-defined name for this fulfillment policy. Names must be unique for policies assigned to the same marketplace. <br/><br/><b>Max length</b>: 64  # noqa: E501

        :return: The name of this FulfillmentPolicyRequest.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this FulfillmentPolicyRequest.

        A seller-defined name for this fulfillment policy. Names must be unique for policies assigned to the same marketplace. <br/><br/><b>Max length</b>: 64  # noqa: E501

        :param name: The name of this FulfillmentPolicyRequest.
        :type name: str
        """

        self._name = name

    @property
    def pickup_drop_off(self) -> bool:
        """Gets the pickup_drop_off of this FulfillmentPolicyRequest.

        This field should be included and set to <code>true</code> if the seller offers the \"Click and Collect\" feature for an item. <p>To enable \"Click and Collect\" on a listing, a seller must be eligible for Click and Collect. Currently, Click and Collect is available to only large retail merchants selling in the eBay AU and UK marketplaces.</p>  <p>In addition to setting this field to <code>true</code>, the merchant must also do the following to enable the \"Click and Collect\" option on a listing: <ul><li>Have inventory for the product at one or more physical stores tied to the merchant's account. <p>Sellers can use the <b>createInventoryLocaion</b> method in the Inventory API to associate physical stores to their account and they can then can add inventory to specific store locations.</p></li><li>Set an immediate payment requirement on the item. The immediate payment feature requires the seller to: <ul><li>Set the <b>immediatePay</b> flag in the payment policy to 'true'.</li><li>Have a valid store location with a complete street address.</li></ul></li></ul><p>When a merchant successfully lists an item with Click and Collect, prospective buyers within a reasonable distance from one of the merchant's stores (that has stock available) will see the \"Available for Click and Collect\" option on the listing, along with information on the closest store that has the item.</p><b>Default</b>: false  # noqa: E501

        :return: The pickup_drop_off of this FulfillmentPolicyRequest.
        :rtype: bool
        """
        return self._pickup_drop_off

    @pickup_drop_off.setter
    def pickup_drop_off(self, pickup_drop_off: bool):
        """Sets the pickup_drop_off of this FulfillmentPolicyRequest.

        This field should be included and set to <code>true</code> if the seller offers the \"Click and Collect\" feature for an item. <p>To enable \"Click and Collect\" on a listing, a seller must be eligible for Click and Collect. Currently, Click and Collect is available to only large retail merchants selling in the eBay AU and UK marketplaces.</p>  <p>In addition to setting this field to <code>true</code>, the merchant must also do the following to enable the \"Click and Collect\" option on a listing: <ul><li>Have inventory for the product at one or more physical stores tied to the merchant's account. <p>Sellers can use the <b>createInventoryLocaion</b> method in the Inventory API to associate physical stores to their account and they can then can add inventory to specific store locations.</p></li><li>Set an immediate payment requirement on the item. The immediate payment feature requires the seller to: <ul><li>Set the <b>immediatePay</b> flag in the payment policy to 'true'.</li><li>Have a valid store location with a complete street address.</li></ul></li></ul><p>When a merchant successfully lists an item with Click and Collect, prospective buyers within a reasonable distance from one of the merchant's stores (that has stock available) will see the \"Available for Click and Collect\" option on the listing, along with information on the closest store that has the item.</p><b>Default</b>: false  # noqa: E501

        :param pickup_drop_off: The pickup_drop_off of this FulfillmentPolicyRequest.
        :type pickup_drop_off: bool
        """

        self._pickup_drop_off = pickup_drop_off

    @property
    def ship_to_locations(self) -> RegionSet:
        """Gets the ship_to_locations of this FulfillmentPolicyRequest.


        :return: The ship_to_locations of this FulfillmentPolicyRequest.
        :rtype: RegionSet
        """
        return self._ship_to_locations

    @ship_to_locations.setter
    def ship_to_locations(self, ship_to_locations: RegionSet):
        """Sets the ship_to_locations of this FulfillmentPolicyRequest.


        :param ship_to_locations: The ship_to_locations of this FulfillmentPolicyRequest.
        :type ship_to_locations: RegionSet
        """

        self._ship_to_locations = ship_to_locations

    @property
    def shipping_options(self) -> List[ShippingOption]:
        """Gets the shipping_options of this FulfillmentPolicyRequest.

        This array is used to provide detailed information on the domestic and international shipping options available for the policy. <br /><br />A separate <b>ShippingOption</b> object is required for domestic shipping service options and for international shipping service options (if the seller ships to international locations). <ul><li>The <b>optionType</b> field is used to indicate whether the <b>ShippingOption</b> object applies to domestic or international shipping, and the <b>costType</b> field is used to indicate whether flat-rate shipping or calculated shipping will be used.</li> <li>The <b>rateTableId</b> field can be used to associate a defined shipping rate table to the policy, and the <b>packageHandlingCost</b> container can be used to set a handling charge for the policy.</li></ul> <p>A separate <b>ShippingServices</b> object will be used to specify cost and other details for every available domestic and international shipping service option. </p>  # noqa: E501

        :return: The shipping_options of this FulfillmentPolicyRequest.
        :rtype: List[ShippingOption]
        """
        return self._shipping_options

    @shipping_options.setter
    def shipping_options(self, shipping_options: List[ShippingOption]):
        """Sets the shipping_options of this FulfillmentPolicyRequest.

        This array is used to provide detailed information on the domestic and international shipping options available for the policy. <br /><br />A separate <b>ShippingOption</b> object is required for domestic shipping service options and for international shipping service options (if the seller ships to international locations). <ul><li>The <b>optionType</b> field is used to indicate whether the <b>ShippingOption</b> object applies to domestic or international shipping, and the <b>costType</b> field is used to indicate whether flat-rate shipping or calculated shipping will be used.</li> <li>The <b>rateTableId</b> field can be used to associate a defined shipping rate table to the policy, and the <b>packageHandlingCost</b> container can be used to set a handling charge for the policy.</li></ul> <p>A separate <b>ShippingServices</b> object will be used to specify cost and other details for every available domestic and international shipping service option. </p>  # noqa: E501

        :param shipping_options: The shipping_options of this FulfillmentPolicyRequest.
        :type shipping_options: List[ShippingOption]
        """

        self._shipping_options = shipping_options
