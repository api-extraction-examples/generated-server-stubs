import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.payments_program_response import PaymentsProgramResponse  # noqa: E501
from openapi_server import util


def get_payments_program(marketplace_id, payments_program_type):  # noqa: E501
    """get_payments_program

    &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is no longer applicable, as all seller accounts globally have been enabled for the new eBay payment and checkout flow.&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;This method returns whether or not the user is opted-in to the specified payments program. Sellers opt-in to payments programs by marketplace and you use the &lt;b&gt;marketplace_id&lt;/b&gt; path parameter to specify the marketplace of the status flag you want returned. # noqa: E501

    :param marketplace_id: This path parameter specifies the eBay marketplace of the payments program for which you want to retrieve the seller&#39;s status.
    :type marketplace_id: str
    :param payments_program_type: This path parameter specifies the payments program whose status is returned by the call.
    :type payments_program_type: str

    :rtype: Union[PaymentsProgramResponse, Tuple[PaymentsProgramResponse, int], Tuple[PaymentsProgramResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
