import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.seller_eligibility_multi_program_response import SellerEligibilityMultiProgramResponse  # noqa: E501
from openapi_server import util


def get_advertising_eligibility(x_ebay_c_marketplace_id, program_types=None):  # noqa: E501
    """get_advertising_eligibility

    This method allows developers to check the seller eligibility status for eBay advertising programs. # noqa: E501

    :param x_ebay_c_marketplace_id: The unique identifier of the eBay marketplace for which the seller eligibility status shall be checked.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This value is case-sensitive.&lt;/span&gt;
    :type x_ebay_c_marketplace_id: str
    :param program_types: A comma-separated list of eBay advertising programs.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; See the &lt;a href&#x3D;\&quot;/api-docs/sell/account/types/plser:AdvertisingProgramEnum\&quot;&gt; AdvertisingProgramEnum&lt;/a&gt; type for possible values.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;If no programs are specified, the results will be returned for all programs.
    :type program_types: str

    :rtype: Union[SellerEligibilityMultiProgramResponse, Tuple[SellerEligibilityMultiProgramResponse, int], Tuple[SellerEligibilityMultiProgramResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
