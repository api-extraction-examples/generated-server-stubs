import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.kyc_response import KycResponse  # noqa: E501
from openapi_server import util


def get_kyc():  # noqa: E501
    """get_kyc

    &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;This method was originally created to see which onboarding requirements were still pending for sellers being onboarded for eBay managed payments, but now that all seller accounts are onboarded globally, this method should now just returne an empty payload with a &lt;code&gt;204 No Content&lt;/code&gt; HTTP status code. &lt;/span&gt; # noqa: E501


    :rtype: Union[KycResponse, Tuple[KycResponse, int], Tuple[KycResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
